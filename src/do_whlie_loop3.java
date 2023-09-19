
// if codition is true then is repeat it self again and again.
import java.util.Scanner;

public class do_whlie_loop3 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number: ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        do {
            System.out.println(num);

        }
        while(num<=10);
    }

}
