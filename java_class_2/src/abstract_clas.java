abstract class animal
{
    void legs()
    {
        System.out.println("all animals have 4 legs");
    }
    abstract void sound();
    abstract void eat();
}
class Dog extends animal
{
    void sound()
    {
        System.out.println("Bow Bow...");
    }
    void eat()
    {
        System.out.println("Meat eating");
    }
}
class Cow extends animal
{
    void sound()
    {
        System.out.println("Oooo Ooooo...");
    }
    void eat()
    {
        System.out.println("Grass eating");
    }
}
public class abstract_clas {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cow c=new Cow();

        d.sound();
        d.eat();
        d.legs();
        c.sound();
        c.eat();
        c.legs();

    }
}
