//   by extending threads class

public class WQ extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("*");
                Thread.sleep(1000);  // it is use for threading after 1 millisecond.
            }
        }
        catch(InterruptedException i)
        {

        }
    }
}
class QWE
{
    public static void main(String[] args) throws InterruptedException{
        WQ t=new WQ();
        t.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("#");
            Thread.sleep(1000);
        }
    }
}