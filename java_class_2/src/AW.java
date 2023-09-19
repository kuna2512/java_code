//    by extending threads class

public class AW {
    public void fun()
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
class QWA
{
    public static void main(String[] args) throws InterruptedException{
        AW t=new AW();
        t.fun();  // here fun method use for printing after 10 millisecond.

        for(int i=1;i<=5;i++)
        {
            System.out.println("#");
            Thread.sleep(1000);
        }
    }
}
