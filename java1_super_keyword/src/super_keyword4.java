public class super_keyword4 {
        super_keyword4()
        {
            System.out.println("Hello Viwer");
        }
    }
    class B extends super_keyword4
    {
        B()
        {
            //super(); :- in the default constructor hare super class create automatic.
            System.out.println("Hello Coders...");
        }
    }
    class Test
    {
        public static void main(String[] args) {
            B r=new B();
        }


    }
