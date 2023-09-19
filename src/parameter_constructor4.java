public class parameter_constructor4 {
    int x,y;
    parameter_constructor4(int a,int b)  // parameterized
    {
        x=a; y=b;
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
class D
{
    public static void main(String[] args) {
        parameter_constructor4 r=new parameter_constructor4
                (100,200);
        r.show();
    }
}
