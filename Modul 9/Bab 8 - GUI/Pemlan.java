public class Pemlan extends MataKuliah {
    public Pemlan() {
        super("Pemlan");
    }

    // Tugas 50%, UTS 20%, UAS 20%, dan Kuis 10%
    @Override 
    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.5) + (nilaiUts * 0.2) + (nilaiUas * 0.2) + (nilaiKuis * 0.1);
    }
}
