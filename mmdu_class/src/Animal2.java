         // heirarchical inheritance


public class Animal2 {
    void eat()

    {
        System.out.println("eating");
    }

}
class Cat extends Animal2
{
    void meow()
    {
        System.out.println("meow");
    }
}
class dog extends Animal2
{
    void bark()
    {
        System.out.println("barking");
    }
}
class Test
{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
}


