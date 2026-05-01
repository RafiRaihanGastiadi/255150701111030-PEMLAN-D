public class Matkomlan extends MataKuliah {
    public Matkomlan() {
        super("Matkomlan");
    }

        // Tugas 40%, UTS 25%, UAS 25%, dan Kuis 10%
        @Override
        public double hitungNilaiAkhir() {
            return (nilaiTugas * 0.4) + (nilaiUts * 0.25) + (nilaiUas * 0.25) + (nilaiKuis * 0.1);
        } 
        

}
