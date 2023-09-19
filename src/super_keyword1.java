public class super_keyword1 {
    int a=10;

}
class aa extends super_keyword1
{
    int a=20;
    void show()
    {
       /* here it is scan only sub class. we see that how to scan super class
        in super_keyword2 experiment */
        System.out.println(a);
    }
}
class Test
{
    public static void main(String[] args) {
        aa r=new aa();
        r.show();
    }
}