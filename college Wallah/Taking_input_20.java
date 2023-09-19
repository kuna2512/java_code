import java.util.Scanner;

public class Taking_input_20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String name = sc.nextLine();
        System.out.println("Your Name is :+name");
        System.out.println("Entre your Lucky No. : ");
        int num = sc.nextInt();
        System.out.println("Lucky Number is : "+ num);
    }
}
