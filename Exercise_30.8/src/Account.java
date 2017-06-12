import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Arthur on 1-5-2017.
 */
public class Account
{
    private static Lock lock = new ReentrantLock();
    private static Condition newDeposit = lock.newCondition();
    private int balance = 0;

    public int getBalance()
    {
        return balance;
    }

    public void withdraw(int amount)
    {
        lock.lock();
        try
        {
            while(balance < amount)
            {
                System.out.println(balance);
                System.out.println("Wait for a deposit");
                newDeposit.await();
            }

            balance = balance - amount;
            System.out.println("Withdraw " + amount + "\t\t" + getBalance());
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }

    public void deposit(int amount)
    {
        lock.lock();
        try
        {
            balance += amount;
            System.out.println("Deposit " + amount + "\t\t\t\t\t" + getBalance());
            newDeposit.signalAll();
        }
        finally {
            lock.unlock();
        }
    }
}
