public class default_constructor3 {
    int a;
    String b;
    boolean c;

    default_constructor3() // default
    {
        a=100; b="kunal"; c=true;
    }
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class B
{
    public static void main(String[] args)
    {
        default_constructor3 r=new default_constructor3();
        r.Disp();
    }
}
