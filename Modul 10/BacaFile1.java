import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BacaFile1 {
    public static void main(String[] args) {
        var filename = "test.txt";
        var file = new File(filename);

        if (file.exists() && file.canRead()) {
            try (var reader = new FileReader(filename);
                 var buffer = new BufferedReader(reader)) {
                
                String line;
                while ((line = buffer.readLine()) != null) {
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