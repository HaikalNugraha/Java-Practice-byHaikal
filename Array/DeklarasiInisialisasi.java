import java.util.Arrays;
public class DeklarasiInisialisasi {
    public static void main(String[] args) {
        // Inline Initialization (Langsung)
        int[] angka = {1, 2, 3, 4, 5};
        String[] nama = {"Haikal", "Adi", "Agus"};
        double[] harga =  {1000, 2000, 3000};

        System.out.println("\n========Ini inisialisasi langsung========");
        System.out.println("Elemen-elemen di array angka yaitu " + Arrays.toString(angka));
        System.out.println("Elemen-elemen di array nama yaitu " + Arrays.toString(nama));
        System.out.println("Elemen-elemen di array harga yaitu " + Arrays.toString(harga));

        // Seperate Initialization (Terpisah)
        int[] nilai;
        nilai = new int[] {90, 30, 58, 34};
        System.out.println("\n=====Ini Insialisasi Terpisah=====");
        System.out.println(Arrays.toString(nilai));

        // Membuat Array dengan Ukuran Tertentu 
        int[] umur = new int[4];
        umur[0] = 90; 
        umur[1] = 40; 
        umur[2] = 60; 
        umur[3] = 94;
        
        System.out.println("\n========Ini dengan ukuran tertentu========");
        System.out.println("Elemen-elemen array umur : " + Arrays.toString(umur));

        // Reference Assignment (Penyalinan Referensi)
        int[] nomor1 = {10, 34, 54};
        int[] nomor2 = nomor1;
        // Melakukan perubahan pada indeks kedua
        nomor1[2] = 157;
        
        System.out.println("\n=====Ini Penyalinan Referensi=====");
        System.out.println("Array nomor1 : ");
        System.out.println(Arrays.toString(nomor1));
        System.out.println("Array nomor2 : ");
        System.out.println(Arrays.toString(nomor2));

        // Membuat Array Baru dengan Salinan Array yang ada
        System.out.println("\nBerikut Salinan Array dari Array nomor1");
        int[] nomor3 = Arrays.copyOf(nomor1, nomor1.length); 

        // Melakukan perubahan pada indeks kedua
        nomor3[2] = 100;

        System.out.println(Arrays.toString(nomor3));
    }
}

/*Dalam Java, new adalah keyword yang digunakan untuk membuat objek baru.
Dalam konteks Array, new digunakan untuk membuat sebuah array baru di memori dengan ukuran tertentu. */