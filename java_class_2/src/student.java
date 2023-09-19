//   simle inheritance

public class student {
    int roll,marks;
    String name;
    void input()
//            private void input() method is not access the this properties of value.
//            here we can also use :- protected int roll,marks;
//            here we can also use :- protected void input
    {
        System.out.println("Enter roll name & markd: ");
    }
}
class ankit extends student
{
    void disp()
    {
        roll=1; name="ankit"; marks=89;
        System.out.println(roll+" "+name+" "+marks);
    }

    public static void main(String[] args) {
        ankit r=new ankit();
        r.input();
        r.disp();
    }
}

// 5:35