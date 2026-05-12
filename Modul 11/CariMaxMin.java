import java.util.*;

public class CariMaxMin {
    public static void main(String[] args) {
        ArrayList<Pemain> timA = buatDataA();
        ArrayList<Pemain> timB = buatDataB();

        Pemain tinggiMaxA = Collections.max(timA, Comparator.comparingInt(p -> p.tinggi));
        Pemain tinggiMinA = Collections.min(timA, Comparator.comparingInt(p -> p.tinggi));

        Pemain beratMaxB = Collections.max(timB, Comparator.comparingInt(p -> p.berat));
        Pemain beratMinB = Collections.min(timB, Comparator.comparingInt(p -> p.berat));

        System.out.println("========== HASIL ANALISIS TIM A ==========");
        System.out.println("Pemain Tertinggi: " + tinggiMaxA);
        System.out.println("Pemain Terpendek: " + tinggiMinA);

        System.out.println("\n========== HASIL ANALISIS TIM B ==========");
        System.out.println("Pemain Terberat : " + beratMaxB);
        System.out.println("Pemain Teringan : " + beratMinB);
    }

    private static ArrayList<Pemain> buatDataA() {
        ArrayList<Pemain> list = new ArrayList<>();
        int[][] data = {{1, 168, 50}, {2, 170, 60}, {3, 165, 56}, {4, 168, 55}, {5, 172, 60}, 
                        {6, 170, 70}, {7, 169, 66}, {8, 165, 56}, {9, 171, 72}, {10, 166, 56}};
        for (int[] d : data) list.add(new Pemain(d[0], d[1], d[2], "A"));
        return list;
    }

    private static ArrayList<Pemain> buatDataB() {
        ArrayList<Pemain> list = new ArrayList<>();
        int[][] data = {{1, 170, 66}, {2, 167, 60}, {3, 165, 59}, {4, 166, 58}, {5, 168, 58}, 
                        {6, 175, 71}, {7, 172, 68}, {8, 171, 68}, {9, 168, 65}, {10, 169, 60}};
        for (int[] d : data) list.add(new Pemain(d[0], d[1], d[2], "B"));
        return list;
    }
}