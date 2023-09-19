import java.util.Scanner;

public class conditional_statement_evenOdd1_35 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("your number is even.");
        }
        else {
            System.out.println("your number is odd.");
        }
    }
}
