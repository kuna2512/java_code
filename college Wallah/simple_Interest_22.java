import java.util.Scanner;
public class simple_Interest_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle");
        float p = sc.nextFloat();

        System.out.println("Enter rate of interest");
        float r = sc.nextFloat();

        System.out.println("Enter Time ");
        float t = sc.nextFloat();

        float si = (p+r+t)/100;

        System.out.println("principle: "+p);
        System.out.println("rate: "+r);
        System.out.println("time: "+t);
        System.out.println("Simple Interest : "+si);

    }
}
