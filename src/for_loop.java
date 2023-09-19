import java.util.Scanner;
public class for_loop {
    public static void main(String[] args)
    {
        int num;
        System.out.println("enter any nnumber: ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(num*i);
    }
}
