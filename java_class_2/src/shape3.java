public class shape3 {
    void draw()
    {
        System.out.println("Can't Say shape Type ");
    }
}
class square3 extends shape3
{
    @Override
    void draw()
    {
        super.draw();
        System.out.println("square shape");
    }
}
class Test3
{
    public static void main(String[] args) {
        shape3 r=new square3();
        r.draw();
    }
}
// here print both class.