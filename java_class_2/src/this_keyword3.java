public class this_keyword3 {
    this_keyword3()
    {
        System.out.println("Learn coding");
    }
    this_keyword3(int a)
    {
        this();  // if we make this(); comment then print 100
        // this class also work for print default constructor
        System.out.println(a);
    }

    public static void main(String[] args) {
        this_keyword3 r=new this_keyword3(100);
    }
}
