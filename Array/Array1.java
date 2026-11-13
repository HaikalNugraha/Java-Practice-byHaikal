import java.util.Scanner;
import java.util.Arrays;
public class Array1 {
    public static void main (String[] args) {
        Scanner inputKey = new Scanner(System.in);

        /* Assignment 
        tipe data[] nama = {elemen-elemen} */
        int[] arrayInteger = {1, 2, 3, 4};
        
        /* Menggunakan deklarasi
        tipedata[] nama = new int[jumlahArray] */ 
        int[] arrayInt = new int[5];
        for (int i=0; i<arrayInt.length; i++) {
            System.out.print("Masukkan angka ke " + (i + 1) + ": ");
            arrayInt[i] = inputKey.nextInt();
        }

        // Menampilkan elemen" di dalam array menggunakan Arrays.toString
        System.out.println("Berikut elemen-elemen di dalam arrayInt : " + Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayInteger));

        // Mencoba looping for each 
        int[] arrayAngka = {1,2,3,4,5,6,7,8,9};
        for (int angka : arrayAngka) {
            System.out.println(angka);
        }
    }
}