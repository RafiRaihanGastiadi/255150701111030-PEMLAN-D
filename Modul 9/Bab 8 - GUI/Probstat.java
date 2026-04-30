public class Probstat extends MataKuliah {
    
    public Probstat() {
        super("Probstat");
    }

        // Tugas 50%, UTS 15%, UAS 15%, dan Kuis 20%
        @Override
        public double hitungNilaiAkhir() {
            return (nilaiTugas * 0.5) + (nilaiUts * 0.15) + (nilaiUas * 0.15) + (nilaiKuis * 0.2);
        }

}
