import java.util.Scanner;

interface MakhlukHidup {
    void makan();
    void berjalan();
    void bersuara();
}

interface Identitas {
    void tampilkanNama();
    void tampilkanUmur();
}

class Manusia implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void makan() {
        System.out.println("Makan pakai sendok garpu");
    }

    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");
    }

    public void bersuara() {
        System.out.println("Suaranya merdu");
    }

    public void tampilkanNama() {
        System.out.println("Nama manusia: " + this.nama);
    }

    public void tampilkanUmur() {
        System.out.println("Umur manusia: " + this.umur);
    }
}

class Kucing implements MakhlukHidup {
    private String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println("Makan ikan");
    }

    public void berjalan() {
        System.out.println("Berjalan dengan empat kaki");
    }

    public void bersuara() {
        System.out.println("Meonggg...");
    }

    public void tampilkanInfo() {
        System.out.println("Nama kucing: " + this.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama manusia: ");
        String namaManusia = input.nextLine();

        System.out.print("Masukkan umur manusia: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama kucing: ");
        String namaKucing = input.nextLine();

        Manusia m = new Manusia(namaManusia, umur);
        Kucing k = new Kucing(namaKucing);

        System.out.println("\n=== DATA MANUSIA ===");
        m.tampilkanNama();
        m.tampilkanUmur();
        m.makan();
        m.berjalan();
        m.bersuara();

        System.out.println("\n=== DATA KUCING ===");
        k.tampilkanInfo();
        k.makan();
        k.berjalan();
        k.bersuara();

        input.close();
    }
}