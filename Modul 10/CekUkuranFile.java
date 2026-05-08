import java.io.File;

public class CekUkuranFile {
    public static void main(String[] args) {
        File file = new File("file_2mb.txt");

        if (file.exists()) {
            long bytes = file.length();
            
            double kiloBytes = bytes / 1024.0;
            double megaBytes = kiloBytes / 1024.0;

            System.out.println("Ukuran asli: " + bytes + " bytes");

            if (megaBytes < 1) {
                System.out.printf("Format Output: %.2f KB\n", kiloBytes);
            } else {
                System.out.printf("Format Output: %.2f MB\n", megaBytes);
            }
            
        } else {
            System.out.println("File tidak ditemukan! Pastikan file 'file_2mb.txt' sudah dibuat.");
        }
    }
}