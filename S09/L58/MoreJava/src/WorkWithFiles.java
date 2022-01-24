import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {
    public static void main(String[] args) {
        File ourFile = new File("our_file.txt");
        try {
            boolean created = ourFile.createNewFile();
            if (created) {
                System.out.println("File was created");
            } else {
                System.out.println("File was not created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
