/**
 * Created by Arthur on 1-5-2017.
 */
public class Value implements Runnable
{
    private int value;

    public Value()
    {
        value = 0;
    }

    public synchronized void increaseByOne()
    {
        value = value + 1;
        System.out.println(value);
    }

    @Override
    public void run() {
        increaseByOne();
    }
}
