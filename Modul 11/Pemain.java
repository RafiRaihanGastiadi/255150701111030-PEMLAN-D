
class Pemain {
    int no;
    int tinggi;
    int berat;
    String tim;

    public Pemain(int no, int tinggi, int berat, String tim) {
        this.no = no;
        this.tinggi = tinggi;
        this.berat = berat;
        this.tim = tim;
    }

    @Override
    public String toString() {
        return String.format("Tim %s | No %-2d | Tinggi: %d cm | Berat: %d kg", tim, no, tinggi, berat);
    }
}