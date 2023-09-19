import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number: ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt(); //num=5
        do {
            System.out.println("Learn Coading....");

        }
        while(num<0); //5<0
    }
}
