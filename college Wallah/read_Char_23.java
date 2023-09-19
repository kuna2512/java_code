// Program to read characters using Scanner Class.

import java.util.Scanner;

public class read_Char_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = sc.next().charAt(2);
        System.out.println("Character is "+ch);


    }
}
