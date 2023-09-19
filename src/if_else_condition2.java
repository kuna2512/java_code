import java.util.Scanner;

public class if_else_condition2 {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter Your age:= ");
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible");
        } else {
            System.out.print("Sorry! You are not eligible....");
        }
    }
}