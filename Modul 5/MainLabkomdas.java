import java.util.Scanner;

public class MainLabkomdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Penjualan Jaket CV. Labkomdas ===");
        
        System.out.print("Masukkan jumlah pembelian Jaket A: ");
        int beliA = input.nextInt();
        Jaket.hitungJaketA(beliA);

        System.out.print("Masukkan jumlah pembelian Jaket B: ");
        int beliB = input.nextInt();
        Jaket.hitungJaketB(beliB);

        System.out.print("Masukkan jumlah pembelian Jaket C: ");
        int beliC = input.nextInt();
        Jaket.hitungJaketC(beliC);

        input.close();
    }
}