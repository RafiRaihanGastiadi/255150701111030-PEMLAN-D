import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        File direktori = new File(".");

        if (direktori.exists() && direktori.isDirectory()) {
            
            File[] daftarItem = direktori.listFiles();

            System.out.println("Daftar file di direktori " + direktori.getAbsolutePath() + ":");
            System.out.println("---------------------------------------------------------");

            if (daftarItem != null) {
                for (File item : daftarItem) {
                    if (item.isFile()) {
                        System.out.println("[FILE]   " + item.getName());
                    } else if (item.isDirectory()) {
                        System.out.println("[FOLDER] " + item.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}