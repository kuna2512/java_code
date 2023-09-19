import java.util.Scanner;
public class else_if_conditoin {
    public static void main(String args[]) {
        int marks;
        System.out.print("Enter your marks: ");
        Scanner obj=new Scanner(System.in);
        marks=obj.nextInt();
        if(marks>=60 && marks<=100)
        {
            System.out.print("First Division");
        }
        else if(marks>=45 && marks<60)
        {
            System.out.print("Second Division");
        }
        else if(marks>=33 && marks<45)
        {
            System.out.print("Third");
        }
        else
        {
            System.out.print("failled...!");
        }
    }
}
