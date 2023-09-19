          // Exception Handling

/*public class Test4 {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a=10,b=0,c;
        c=a/b; // c=10/0
        System.out.println(c);
        System.out.println("main method ended");
    }
}*/
//in this code exception is available.
// in the next code we write  for that how to handle exception

public class Test4 {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a=10,b=0,c;
        try
        {
            c=a/b; // c=10/0
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e);   // this line shows reason of Exception
        }
        System.out.println("main method ended");
    }
}