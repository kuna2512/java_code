public class BBA implements Runnable
{
    public void run()
    {
        for( int i=1;i<=5;i++)
        {
            System.out.println("My Child Thread");

        }
    }
}
class ABB
{
    public static void main(String[] args) {
        BBA r=new BBA();
        Thread t=new Thread(r);
        t.start();

        for( int i=1;i<=5;i++)
        {
            System.out.println("My Thread");

        }
    }

}

/*main Thread has two jobs first one is create child class and start that class
 and second one is executing the code */
/*child thread has only one job that child thread execute the code which is written in the
* public void run()   */
