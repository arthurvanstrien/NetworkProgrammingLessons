import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Arthur on 1-5-2017.
 */
public class ThreadCooperation {
    private static Account account = new Account();

    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new DepositTask());
        executorService.execute(new WithdrawTask());
        executorService.shutdown();
    }
}
