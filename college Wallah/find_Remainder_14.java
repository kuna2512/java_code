// Take two integers input,a and b : a>b, and find the remainder when a is divided by b.

import java.util.Scanner;
public class find_Remainder_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your dividend :");
        int a;
        a = sc.nextInt();
        System.out.println("Enter Your divisor :");
        int b;
        b = sc.nextInt();
        double Quotient = a/b;
        double r = a - (b*Quotient);
        System.out.println("Your remainder when "+a+" is divided by "+b+" is "+r );
    }
}
