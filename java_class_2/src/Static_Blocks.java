import javax.imageio.stream.ImageInputStream;

// Instance_vs_Static_Blocks
public class Static_Blocks
{

    int a=10; static int b=20; // static deal with class.
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){
    Static_Blocks r=new Static_Blocks();


    }

}
