import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("Number before Swap: "+x+" "+y);
        x=x+y;
        y=x-y;
        System.out.println("Number after Swap: "+ x +" "+y);

    }
}
