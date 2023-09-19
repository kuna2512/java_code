// take positive integer input and tell if it is even or odd.
import java.util.Scanner;
public class conditional_statement_evenOdd_34 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
      //  System.out.println(n);
        if(n%2==0){
            System.out.println("The number is even.");
        }
        if(n%2!=0){
            System.out.println("The number is odd. ");
        }
    }
}
