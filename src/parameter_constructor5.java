public class parameter_constructor5 {
    int x,y;
    parameter_constructor5(int a,int b)  // parameterized
    {
        x=a; y=b;
    }
    parameter_constructor5(int a,String b)  // parameterized
    {
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
class E
{
    public static void main(String[] args) {
        parameter_constructor5 r=new parameter_constructor5
                (100,200);
        parameter_constructor5 ref=new parameter_constructor5
                (10,"kunal");
        r.show();
    }
}
