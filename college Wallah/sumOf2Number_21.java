import java.util.Scanner;

public class sumOf2Number_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no. :");
        int num_1 =sc.nextInt();
        System.out.println("Enter your second no. : ");
        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;
        System.out.println("Sum :"+sum);
    }
}
