import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        try
        {
            try (FileReader r = new FileReader("D:\\ideaProject\\java_class_2\\kunal.txt")) {
                int i;
                while ((i = r.read()) != -1)
                {
                    System.out.println((char) i);
                }
            }
            finally
            {
                System.out.println("File Closed....");
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception Handled....");
        }
    }
}
