import java.util.Scanner;
public class areaCircleWithInput_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius : ");
        int radius;
        radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi* radius*radius;
        System.out.println("The area of circle is : "+area);
    }
}
