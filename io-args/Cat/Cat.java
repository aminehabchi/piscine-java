
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Cat {

    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {

            return;
        }

        byte[] buffer = new byte[8192];
        try (InputStream in = new FileInputStream(args[0])) {
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        }
        System.out.flush();
    }
}
