//     inheritance

class I {
    void input()
    {
        System.out.println("Enter Your Name: ");
    }
}
class J extends I
{
    void show()
    {
        System.out.println("My Name is Kunal");
    }
}
class H extends I
{
    void Disp()
    {
        System.out.println("My Name is Anuj");
    }
}
class Demo
{
    public static void main(String[] args) {
        J r=new  J();
        H r2=new H();

        r.input();
        r.show();
        r2.input();
        r2.Disp();
    }
}
//   6:05
