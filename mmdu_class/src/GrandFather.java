           // Hybrid inheritance

public class GrandFather {
    void showG()
    {
        System.out.println("He is Grand father");
    }
}
class Father extends GrandFather
{
    void showF()
    {
        System.out.println("He is Father");
    }
}
class Son extends Father
{
    void shoeS()
    {
        System.out.println("He is Son");
    }
}
class Daughter extends Father {
    void showD() {
        System.out.println("She is Daughter");
    }
}
class Test3
{
    public static void main(String[] args) {
        Son S=new Son();
        S.shoeS(); S.showF(); S.showG();

        Daughter D=new Daughter();
        D.showD(); D.showF(); D.showG();
    }
}
