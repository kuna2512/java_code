import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try
        {
            FileWriter f=new FileWriter("D:\\ideaProject\\java_class_2\\src");
            try
            {
                f.write("java Programing is the best Languagel...1");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully Data wrote in File");
        }
        catch (IOException i)
        {
            System.out.println(i);
        }
        {

        }
    }
}
