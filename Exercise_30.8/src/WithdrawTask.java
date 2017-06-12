/**
 * Created by Arthur on 1-5-2017.
 */
public class WithdrawTask implements Runnable
{
    private static Account account = new Account();

    public void run()
    {
        while(true)
        {
            int amount = (int)(Math.random() * 10) + 1;
            System.out.println("Amount to withdraw: " + amount);
            account.withdraw(amount);
        }
    }
}
