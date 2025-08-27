
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Capitalize {

    public static String capitalizep(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        word = word.toLowerCase();
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }
        String content = "";
        try {
            content = Files.readString(Paths.get(args[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
        content = content.trim();
        String[] parts = content.split(" ");
        content = "";
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].isEmpty()) {
                continue;
            }
            content = content + " " + capitalizep(parts[i]);
        }
        content = content.trim();
        try (FileWriter writer = new FileWriter(args[1])) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Capitalize.capitalize(args);
    }       
}
