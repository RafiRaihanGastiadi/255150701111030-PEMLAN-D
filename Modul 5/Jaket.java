public class Jaket {
    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    public static void hitungJaketA(int jumlah) {
        int hargaSatuan;
        if (jumlah > 100) {
            hargaSatuan = 95000;
        } else {
            hargaSatuan = HARGA_A;
        }
        int total = jumlah * hargaSatuan;
        System.out.println("Tipe Jaket : A");
        System.out.println("Jumlah Beli: " + jumlah);
        System.out.println("Total Harga: Rp " + total);
        System.out.println("---------------------------");
    }

    public static void hitungJaketB(int jumlah) {
        int hargaSatuan;
        if (jumlah > 100) {
            hargaSatuan = 120000;
        } else {
            hargaSatuan = HARGA_B;
        }
        int total = jumlah * hargaSatuan;
        System.out.println("Tipe Jaket : B");
        System.out.println("Jumlah Beli: " + jumlah);
        System.out.println("Total Harga: Rp " + total);
        System.out.println("---------------------------");
    }

    public static void hitungJaketC(int jumlah) {
        int hargaSatuan;
        if (jumlah > 100) {
            hargaSatuan = 160000;
        } else {
            hargaSatuan = HARGA_C;
        }
        int total = jumlah * hargaSatuan;
        System.out.println("Tipe Jaket : C");
        System.out.println("Jumlah Beli: " + jumlah);
        System.out.println("Total Harga: Rp " + total);
        System.out.println("---------------------------");
    }
}