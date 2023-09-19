// this is use to print same reference id two timed
public class this_keyword {
    void show()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        this_keyword r=new this_keyword();   // A r=new A();
        System.out.println(r);
        r.show();
    }
}