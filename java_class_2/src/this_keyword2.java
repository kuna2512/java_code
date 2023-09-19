public class this_keyword2 {
   int a;
    this_keyword2(int a)
    {
//        this.a=a; is write here for correct output.
        a=a;
    }
    void show()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        this_keyword2 r=new this_keyword2(100);
        r.show();
    }
}

/*here output is zero. this is default value of int. here jvm started confuse
 that which (a=a;) one is instance variable and local variable and ignore one ,
 give output of default value :- null.
 for get correct value write code   this.a=a;    */