
import java.util.Scanner;
public class for_each_loop {
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.print("Enter Array Element: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("\nArray Element: ");
        for (int b : a) {
            System.out.println(b + " ");
        }
    }
}