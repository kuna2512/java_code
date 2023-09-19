

// it example of 2d arrays

import java.util.Scanner;
public class arrays_class5 {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        System.out.println("Enter Array Elemrnt: ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("\nMatrix Element:\n ");
        // here \n use for printing new line
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
