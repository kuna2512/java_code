// W.A.P to take input of a number & print the square of it.

import java.util.Scanner;
public class squareOf2NoInput_13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter No. :");
        int x;
        x=sc.nextInt();
        int square = x*x;
        System.out.println("The square of the no. is : "+square);
    }
}
