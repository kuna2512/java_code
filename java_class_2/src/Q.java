// by extending threads class

public class Q extends Thread {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            System.out.println("*");

        }
    }
}
class QQ
{
    public static void main(String[] args) {
        Q t=new Q();
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("#");
        }
    }
}
