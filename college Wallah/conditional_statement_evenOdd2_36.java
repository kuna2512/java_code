// Take positive integer input and tell if it is divisible by 5 or not.

import java.util.Scanner;

public class conditional_statement_evenOdd2_36 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n =sc.nextInt();
        if(n%5==0){
            System.out.println("Your no. is even.");

        }
        else {
            System.out.println("Your no. is odd.");
        }

    }
}
