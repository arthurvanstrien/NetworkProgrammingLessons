/**
 * Created by Arthur on 15-5-2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        new Main();
    }

    public Main()
    {
        int numberOf = 1000;
        int randomNumber = 0;

        for(int i = 0; i < numberOf; i++)
        {
            randomNumber = (int) (Math.random() * numberOf) + 1;
            addToTree(randomNumber);
        }
    }

    public void addToTree(int value)
    {
        System.out.println(value);
    }


}
