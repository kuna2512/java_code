public class copy_constructor6 {
    int a; String b;
    copy_constructor6()
    {
        a=10; b="kunal";
        System.out.println(a+" "+b);
    }
    copy_constructor6(copy_constructor6 ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
class F
{
    public static void main(String[] args) {
        copy_constructor6 r=new copy_constructor6();
        copy_constructor6 r2=new copy_constructor6(r);

    }
}