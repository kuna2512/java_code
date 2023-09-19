// Any year is input through the keyboard. write a program to determine whether the yeat id a leap year or not.(consider leap year occurs after every 4 years)

import java.util.Scanner;

public class conditional_statement_leapYear_37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your year: ");
        int year = sc.nextInt();
        if(((year/4==0) && (year/100!=0))||(year%400==0)){
            System.out.println("This year is leap year.");
        }
        else{
            System.out.println("This year is not leap year.");
        }
    }
}
