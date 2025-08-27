
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileManager {

    public static void createFile(String fileName, String content) throws IOException {
        // your code here
        File file = new File(fileName);
        try {

            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        String content = "";
        try {
            content = Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}
