public abstract class MataKuliah {
    protected String nama;
    protected int nilaiUts;
    protected int nilaiUas;
    protected int nilaiTugas;
    protected int nilaiKuis;

    public MataKuliah(String namaString) {
        this.nama = namaString;
    }

    public String getNama() {
        return nama;
    }

    public void setNilai(int nilaiUts, int nilaiUas, int nilaiTugas, int nilaiKuis) {
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.nilaiTugas = nilaiTugas;
        this.nilaiKuis = nilaiKuis;
    }

    public abstract double hitungNilaiAkhir();

}
