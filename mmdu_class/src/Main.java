// Lion.java
//package animals;

class Lion {
    public int age = 12;
    public String color = "brown";
    public double weight = 320;
    public boolean isOld() {
        return false;
    }
    public String sound() {
        return "roar";
    }
    public boolean canKill() {
        return true;
    }
}

// Elephant.java
//package animals;

class Elephant {
    public int age = 20;
    public double weight = 985.3;
    public String color = "grey";
    public boolean isOld() {
        return true;
    }
    public boolean canKill() {
        return true;
    }
    public String sound() {
        return "mumbles";
    }
}

// Monkey.java
//package animals;

class Monkey {
    public int age = 5;
    public String color = "Black";
    public double weight = 5.3;
    public String sound() {
        return "clatter";
    }
    public boolean isOld() {
        return false;
    }
    public boolean canKill() {
        return false;
    }
}

// Main.java
//package zoo;

//        import animals.*;

public class Main {
    public static void main(String[] args) {
        var lion = new Lion();
        var elephant = new Elephant();
        var monkey = new Monkey();
        System.out.println(lion.color +lion.age+lion.weight);
        System.out.println(monkey.isOld());
        System.out.println(elephant.age+" "+elephant.weight+" "+elephant.color);
        System.out.println(elephant.canKill());
        System.out.println(monkey.age+monkey.weight+monkey.color);
    }
}
