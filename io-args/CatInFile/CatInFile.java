
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CatInFile {

    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        try (BufferedInputStream bis = new BufferedInputStream(System.in); FileOutputStream fos = new FileOutputStream(args[0])) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

}
