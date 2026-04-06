public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        String prodiStr = "";
        char prodiDigit = nim.charAt(6);
        
        switch (prodiDigit) {
            case '2': prodiStr = "Teknik Informatika"; break;
            case '3': prodiStr = "Teknik Komputer"; break;
            case '4': prodiStr = "Sistem Informasi"; break;
            case '6': prodiStr = "Pendidikan Teknologi Informasi"; break;
            case '7': prodiStr = "Teknologi Informasi"; break;
        }
        return prodiStr + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) return 75.0;
        if (ipk >= 3.0) return 50.0;
        return 0.0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nnim       : %s\nipk       : %.1f\nstatus    : %s", 
                nim, ipk, getStatus());
    }
}