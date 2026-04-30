public class ASD extends MataKuliah  {
    public ASD() {
        super("ASD");
    }

    // Tugas 50%, UTS 15%, UAS 20%, dan Kuis 15%
    @Override
    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.5) + (nilaiUts * 0.15) + (nilaiUas * 0.2) + (nilaiKuis * 0.15);
    }

}
