//          create a file
import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args){
        File f=new File("D:\\ideaProject\\java_class_2");
        try {

            if(f.createNewFile())
            {
                System.out.println("File Successfully Create...!");
            }
            else
            {
                System.out.println("File Already Exist...!");
            }
        }
        catch (IOException i)
        {
            System.out.println("Exception Handel...");
        }

    }
}
