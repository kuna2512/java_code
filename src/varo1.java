public class varo1 {
    int a=10; // instance varible
     static double b=20.5; // static varible
    public static void main(String avgs[]){
        System.out.println("variable");
        boolean c=true; // local varible

        // make a new object to accessing the instance varible

        varo1 s=new varo1();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);

//        System.out.println(s.a+" "+b+" "+c);
//        we also print in one line using concatenation like above



    }
}
