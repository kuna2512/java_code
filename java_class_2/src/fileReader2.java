import java.io.FileReader;
import java.io.IOException;

public class fileReader2 {
    public static void main(String[] args) throws IOException {
        FileReader r1=new FileReader("D:\\ideaProject\\java_class_2\\kunal.txt");

        int i;
        while((i=r1.read())!=-1)
        {
            System.out.println((char)i);
        }
    }
}
