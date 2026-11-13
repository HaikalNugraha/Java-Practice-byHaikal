import java.util.Arrays;

public class PerulanganArray {
    public static void main(String[] args) {
        
        int i;
        // Perulangan Pada Array Menggunakan For 
        int[] nilai = {20, 56, 24, 64, 35, 65, 93, 78};

        System.out.println("\nMenampilkan Semua Elemen Menggunakan Perulangan Sesuai Indeks[i]");
        for (i = 0; i < nilai.length; i++) {
            System.out.println("indeks ke-" + i + " adalah " + nilai[i]);
        }

        // Mengubah Elemen Array dengan For
        int[] angka = {1000, 1500, 2000, 2500};

        System.out.println("\nElemen Sebelum Ditambah : " + Arrays.toString(angka));
        System.out.println("Elemen Array Setelah Ditambah 5000");
        for (i = 0; i<angka.length; i++) {
            angka[i] = angka[i] + 5000;
            System.out.println(angka[i]);
        }

        // Perulangan Pada Array Menggunakan For Each
        System.out.println("\n===Menampilkan Elemen Menggunakan Perulangan For-each===");

        String[] nama = {"Adi", "Ica", "Ida"};
        for (String n : nama) {
            System.out.println(n);
        }

        // int adalah tipe data elemen array
        // n adalah variabel semetara
        // nilai adalah array yang dibaca
    }
}
