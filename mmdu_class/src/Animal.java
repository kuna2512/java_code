         // multilevel inheritance

public class Animal {
    void eat()
    {
        System.out.println("eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("barking");
    }
}
class Puppy extends Dog
{
    void cry()
    {
        System.out.println("crying");
    }
}
class TestInt
{
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.cry();
        p.bark();
        p.eat();
    }
}
