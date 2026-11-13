import java.util.Arrays;

public class PengolahanData {
    public static void main(String[] args) {
        
        // MENGHITUNG JUMLAH ELEMEN ARRAY
        int[] nilai = {80, 49, 29, 54, 43};
        int total = 0;
        int i;

        for (i = 0; i<nilai.length; i++) {
            total += nilai[i];
        }
        System.out.println("\n=====Penjumlahan Elemen Array=====");
        System.out.println("Elemen Array : " + Arrays.toString(nilai));
        System.out.println("Total Keseluruhannya elemen berikut : " + total);

        
        // MENGHITUNG RATA RATA
        double rataRata;
        double jumlah = 0;
        int[] nilai2 = {23, 98, 34, 54};

        for (i = 0; i<nilai2.length; i++) {
            jumlah += nilai2[i];
        }
        rataRata = jumlah / nilai2.length;
        
        System.out.println("\n=====Menghitung Rata-Rata=====");
        System.out.println("Elemen Array : " + Arrays.toString(nilai2));
        System.out.println("Rata-rata    : " + rataRata);
        System.out.println("Total Elemen : " + nilai2.length);
        
        // MENCARI NILAI TERBESAR
        int[] nilai3 = {22, 45, 44, 55};
        
        int terbesar = nilai3[0];
        
        for (i = 1; i < nilai3.length; i++) {
            if (nilai3[i] > terbesar) {
                terbesar = nilai3[i];
            }
        }
        System.out.println("\n=====Mencari Nilai Terbesar=====");
        System.out.println("Elemen Array : " + Arrays.toString(nilai3));
        System.out.println("Nilai terbesar pada array tersebut yaitu : " + terbesar);
        
        // MENCARI NILAI TERKECIL
        int[] nilai4 = {19, 94, 39, 10, 43, 34, 50};
        
        int terkecil = nilai4[nilai4.length-1];
        
        for (i = 0; i < nilai4.length; i++) {
            if (nilai4[i] < terkecil) {
                terkecil = nilai4[i];
            }
        }
        System.out.println("\n=====Mencari Nilai Terkecil=====");
        System.out.println("Elemen Array : " + Arrays.toString(nilai4));
        System.out.println("Nilai terkecil pada array tersebut yaitu : " + terkecil);
    }
}
