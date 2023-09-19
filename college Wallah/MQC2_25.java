// what is the output of the following code, if input is : hello world 21.

import java.util.Scanner;

public class MQC2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sting :");
        String p = sc.next();
        System.out.println("Enter your Number :");
        int q = sc.nextInt();
        System.out.println(p+" "+q);

    }
}
// output is : InputMismatchException
// here integer scan String Value.
