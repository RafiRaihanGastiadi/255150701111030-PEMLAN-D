public class MainFILKOM {
    public static void main(String[] args) {
        
        // --- 1. TEST CASE MANUSIA ---
        System.out.println("=== TEST CASE MANUSIA ===");
        // a. Laki-laki telah menikah
        Manusia m1 = new Manusia("Reza Arap", "351512345678", true, true);
        System.out.println(m1);
        System.out.println();

        // b. Perempuan telah menikah
        Manusia m2 = new Manusia("Fuji Utami", "351587654321", false, true);
        System.out.println(m2);
        System.out.println();

        // c. Belum menikah
        Manusia m3 = new Manusia("Sir Owi", "351500001111", true, false);
        System.out.println(m3);
        System.out.println("----------------------------------\n");


        // --- 2. TEST CASE MAHASISWA FILKOM ---
        System.out.println("=== TEST CASE MAHASISWA FILKOM ===");
        // a. IPK < 3
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("225150601111001", 2.8, "Andi", "123456789", true, false);
        System.out.println(mhs1);
        System.out.println();

        // b. IPK 3 - 3.5
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("205150401111002", 3.2, "Budi", "987654321", true, false);
        System.out.println(mhs2);
        System.out.println();

        // c. IPK 3.5 - 4
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("165150300111100", 4.0, "Cici", "986754231", false, false);
        System.out.println(mhs3);
        System.out.println("----------------------------------\n");


        // --- 3. TEST CASE PEKERJA ---
        System.out.println("=== TEST CASE PEKERJA ===");

        Pekerja p1 = new Pekerja(1000, 2024, 1, 1, 2, "Yanto Inpestasi", "837473289", true, true);
        System.out.println(p1);
        System.out.println();

        Pekerja p2 = new Pekerja(1000, 2017, 1, 1, 0, "Deden Tasikmalaya", "843957389", true, true);
        System.out.println(p2);
        System.out.println();

        Pekerja p3 = new Pekerja(1000, 2006, 1, 1, 10, "Dwi Artanto", "232837489", true, true);
        System.out.println(p3);
        System.out.println("----------------------------------\n");

        System.out.println("=== TEST CASE MANAGER ===");
        Manager mgr = new Manager("HRD", 7500, 2011, 1, 1, 0, "Ading Firman", "2873827389", true, true);
        System.out.println(mgr);
    }
}