public class super_keyword4 {
    super_keyword4(int a)
    {
        System.out.println("Hello Viwer");
    }
}
class B extends super_keyword4
{
    B()
    {
        super(100);  // in the case of superize constructor we need to write
        System.out.println("Hello Coders...");
    }
}
class Test
{
    public static void main(String[] args) {
        B r=new B();
    }


}


