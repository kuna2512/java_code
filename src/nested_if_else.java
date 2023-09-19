
//find grater number using nested if else.
public class nested_if_else {
    public static void main(String avgs[])
    {
        int num1=20,num2=10,num3=15;

//        System.out.print("Enter a number: ");
//        Scanner object=new Scanner(System.in);
//        num1=object.nextInt();
//        num2=object.nextInt();
//        num3=object.nextInt();
// we can't use 7,8,9,10,11 lines for this.

        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.print("Maximum number: "+num1);
            }
            else
            {
                System.out.print("Maximum number: "+num3);
            }

        }
        else
        {
            if(num2>num3)
            {
                System.out.print("Maximum number: "+num2);
            }
            else
            {
                System.out.print("Maximum number: "+num1);
            }
        }
    }
}
