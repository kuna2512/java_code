import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        int eggs;
        int gross;
        int dozen;
        int extra;

        System.out.println("No. of Eggs are available: ");
        Scanner s = new Scanner(System.in);
        eggs = s.nextInt();
        gross = eggs / 144;
        int remainingEggs = eggs % 144;
        dozen = remainingEggs / 12;
        extra = remainingEggs % 12;

        System.out.print("eggs: ");
        System.out.println(eggs);
        System.out.print("gross: ");
        System.out.println(gross);
        System.out.print("dozen: ");
        System.out.println(dozen);
        System.out.print("extra: ");
        System.out.println(extra);

    }
}
