public class default_constructor2 {
    int a;
    String b;
    boolean c;

    /* default_constructor2() // default
    {
        a=100; b="kunal"; c=true;
    }*/

/*   here we make comment of default constructor.
*  than in this condition jvm automatic add default constructor,
*  and get output: 0 null false. this added  default constructor is
*  not useful so we create default constructor */

    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class C
{
    public static void main(String[] args) {
        default_constructor2 r = new default_constructor2();
        r.Disp();
    }
}
