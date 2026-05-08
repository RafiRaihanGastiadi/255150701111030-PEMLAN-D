import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 {
    public static void main(String[] args) {
        System.out.print("Masukkan teks yang akan disimpan: ");
        
        var keyboard = new Scanner(System.in);
        var text = keyboard.nextLine();

        try (var writer = new FileWriter("test.txt", false)) { 
            writer.write(text);
            System.out.println("Berhasil menulis ke file.");
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file: " + e.getMessage());
        }
    }
}