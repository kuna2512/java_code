public class this_keyword4
{
    this_keyword4()
    {
        this(10);
    }
    this_keyword4(int a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        this_keyword4 r=new this_keyword4();
    }

}
