//     inheritance

/* public class D {
    void show()
    {
        System.out.println("This is class D");
    }
}
class E
{
    void show()
    {
        System.out.println("This is class E");
    }
}
class Multiple extends D,E  // here showing error
{
    public static void main(String[] args) {
        Multiple m=new Multiple();
        m.show();
    }
}  */



interface D {
    void show();  // public + abstract
}
interface E
{
    void show();   // public + abstract
}
class Multiple implements D,E
{
   public void show()   // here void show is public show because of this reason we need to write public void show()
    {
        System.out.println("Interface A & B");
    }
    public static void main(String[] args) {
        Multiple m=new Multiple();
        m.show();
    }
}