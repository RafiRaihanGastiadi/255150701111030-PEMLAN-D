import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UrutanTinggi {
    public static void main(String[] args) {
        ArrayList<Pemain> timA = new ArrayList<>();
        int[][] dataA = {
            {1, 168, 50}, {2, 170, 60}, {3, 165, 56}, {4, 168, 55}, {5, 172, 60},
            {6, 170, 70}, {7, 169, 66}, {8, 165, 56}, {9, 171, 72}, {10, 166, 56}
        };
        for (int[] d : dataA) timA.add(new Pemain(d[0], d[1], d[2], "A"));

        ArrayList<Pemain> timB = new ArrayList<>();
        int[][] dataB = {
            {1, 170, 66}, {2, 167, 60}, {3, 165, 59}, {4, 166, 58}, {5, 168, 58},
            {6, 175, 71}, {7, 172, 68}, {8, 171, 68}, {9, 168, 65}, {10, 169, 60}
        };
        for (int[] d : dataB) timB.add(new Pemain(d[0], d[1], d[2], "B"));

        System.out.println("========== TIM A ==========");
        Collections.sort(timA, Comparator.comparingInt(p -> p.berat));
        System.out.println("Berat Ascending (Menaik):");
        timA.forEach(System.out::println);

        Collections.sort(timA, Comparator.comparingInt((Pemain p) -> p.berat).reversed());
        System.out.println("\nBerat Descending (Menurun):");
        timA.forEach(System.out::println);

        System.out.println("\n" + "=".repeat(30) + "\n");

        System.out.println("========== TIM B ==========");
        Collections.sort(timB, Comparator.comparingInt(p -> p.berat));
        System.out.println("Berat Ascending (Menaik):");
        timB.forEach(System.out::println);

        Collections.sort(timB, Comparator.comparingInt((Pemain p) -> p.berat).reversed());
        System.out.println("\nBerat Descending (Menurun):");
        timB.forEach(System.out::println);
    }   
}