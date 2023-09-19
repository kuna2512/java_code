// if cost price and selling price of an item is input through the keyboard, Write a program to detemine the seller has made profit or incurred loss. also determine how much profit he made or loss he incurred.
import java.util.Scanner;
public class profitLoss_39 {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter cost price :");
                int cp = sc.nextInt();
                System.out.println("Enter selling price :");
                int sp = sc.nextInt();
                if(sp>cp){
                        System.out.print("Your profit is :");
                        System.out.println(sp-cp);
                }
                if(cp>sp){
                        System.out.print("Your loss is :");
                        System.out.println(cp-sp);
                }
        }
}
