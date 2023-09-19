public class constructor1_class {
    int a; String name;
    constructor1_class()
    {
        a=0; name=null;
    }
    void show()
    {
        System.out.println(a+" "+name);
    }
}
class b
{
    public static void main(String[] args) {

        constructor1_class ref=new constructor1_class();
        ref.show();
    }
}
// 3:28 hours right but somthing for understand.