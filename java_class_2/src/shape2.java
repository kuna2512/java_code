// method overriding

public class shape2 {
    void draw()
    {
        System.out.println("Can't Say shape Type ");
    }
}
class square2 extends shape2
{
    void draw2()
    {
        System.out.println("square shape");
    }
}
class Test2
{
    public static void main(String[] args) {
        shape2 r=new square2();
        r.draw();
    }
}

// if method is not override then in that condition they print of super class.