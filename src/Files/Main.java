package Files;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String folderPath = "D:\\projects\\0000\\MyTests\\src\\Files\\Storage";
        URL url = new URL("https://avatars.mds.yandex.net/get-altay/10216747/2a000001896cfd008fbf536ecbef9ad4cd15/XL");
        InputStream inputStream = url.openStream();

        Path folder = Paths.get(folderPath);
        if (!Files.exists(folder)) {
            Files.createDirectory(folder);
        }

        String fileName = "image.jpg";
        Path tempFile = folder.resolve(fileName);
        if (Files.exists(tempFile)) {
            Files.delete(tempFile);
        }

        Files.copy(inputStream, tempFile);

        System.out.println("Картинка была сохранена в папке " + folderPath + " с именем " + fileName);
    }
}
