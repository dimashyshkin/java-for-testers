import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("our_file_1.txt");
            writer.write("Hello, Dmitry!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
