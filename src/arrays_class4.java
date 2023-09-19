
// it is example of 1d arrays.
import java.util.Arrays;
import java.util.Scanner;
public class arrays_class4 {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.print("Enter Array Element: ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Arrays Element:\n");
        for(int b : a)
        {
            System.out.println(b+" ");
        }

    }
}
