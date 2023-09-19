//        inheritance

public class A {
    int a,b,c;
    void add()
    {
        a=10; b=20;
        c=a+b;
        System.out.println("Sum of two numbers: "+c);
    }
    void sub()
    {
        a=100; b=30;
        c=a-b;
        System.out.println("Sub of two numbers: "+c);
    }
}
class B extends A
{
    void multi()
    {
        a=10; b=20;
        c=a*b;
        System.out.println("Multiplication of two numbers: "+c);
    }
    void div()
    {
        a=10; b=20;
        c=a/b;
        System.out.println("Divion of two numbers: "+c);
    }
}
class C extends B
{
    void rem() {
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("Remainder of two numbers: " + c);
    }
}
class Test
{
    public static void main(String[] args) {
        C r=new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();

    }
}
