import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("mile.txt");
            fileWriter.write("Hey Coders");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileReader fileReader = new FileReader("mile.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) { // Corrected the use of "scanner"
                String content = scanner.nextLine(); // Corrected the use of "scanner"
                System.out.println(content);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
