import java.util.Scanner;

// we also write like this for scanning.
//import java.util.*;

public class add {
    public static void main(String avgs[]){
        int a,b,c;
//        here c is for adding two number
        System.out.print("enter any two number: ");

//        make a new scanner object
        Scanner s=new Scanner(System.in);

//        now scan object a & b
        a=s.nextInt();
        b=s.nextInt();

//        now add using c
        c=a+b;
        System.out.print("Sum of two number: "+c);





    }
}
