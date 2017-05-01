/**
 * Created by Arthur on 1-5-2017.
 */
public class Main
{
    Value value = new Value();

    public static void main(String[] Args)
    {
        new Main();
    }

    public Main()
    {
        System.out.println("Calculating...");
        for(int i = 0; i < 1000; i++)
        {
            createNewThread();
        }
    }

    public void createNewThread()
    {
        Thread thread = new Thread(value);
        thread.start();
    }
}
