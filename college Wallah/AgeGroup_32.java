// write a program to divide people into 3 age group depending upon their age.

import java.util.Scanner;

public class AgeGroup_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age <= 12){
            System.out.println("child");

        }
        else if (age > 12 && age <18 )
        {
            System.out.println("teenager");
        }
        else {
            System.out.println("adult");
        }
    }
}
