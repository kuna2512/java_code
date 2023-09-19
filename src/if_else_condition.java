import java.util.Scanner;
public class if_else_condition {
    public static void main(String[] args) {
        int pass;
        System.out.print("Enter Password:= ");
        Scanner obj=new Scanner(System.in);
        pass=obj.nextInt();
        if(pass==2512)
        {
            System.out.println("My name:= Priyanshu");
            System.out.println("My age:= 17");
            System.out.println("My address:= Hajipur");
            System.out.println("My contact no.:= 9135998832");
            System.out.println("My name:= baekunal1505a@gmail.com");
        }
        else
        {
            System.out.print("Sorry! Wrong Password....");
        }


        }
    }


