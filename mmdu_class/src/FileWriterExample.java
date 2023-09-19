import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("C:\\Users\\kunal\\Desktop\\FileWriterExample.txt");
            try {
                w.write("Hey!! it's me Kunal..!");
            } finally {
                w.close();
            }
            System.out.println("Hey Wow! you did it with easily way.");
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
   }
}