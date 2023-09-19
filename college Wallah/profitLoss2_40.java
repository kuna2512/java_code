import java.util.Scanner;

public class profitLoss2_40 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price :");
        int cp = sc.nextInt();
        System.out.println("Enter selling price :");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.print("Your profit is :");
            int profit = sp-cp;
            System.out.println(profit);
        }
        if(cp>sp){
            System.out.print("Your loss is :");
            int loss = cp - sp;
            System.out.println(loss);
        }
    }
}
