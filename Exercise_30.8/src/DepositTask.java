/**
 * Created by Arthur on 1-5-2017.
 */
public class DepositTask implements Runnable
{
    private static Account account = new Account();

    public void run()
    {
        try
        {
            while(true)
            {
                account.deposit((int)(Math.random() * 10) + 1);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
