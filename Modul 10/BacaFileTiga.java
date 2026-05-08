import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BacaFileTiga {
    public static void main(String[] args) {
        var path = Paths.get("test.txt");
        var file = path.toFile();

        if (file.exists() && file.canRead()) {
            try {
                List<String> lines = Files.readAllLines(path);
                for (var line : lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Gagal membaca file: " + e.getMessage());
            }
        } else {
            System.out.println("File tidak ada atau tidak bisa dibaca");
        }
    }
}