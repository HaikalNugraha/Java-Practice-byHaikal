import java.util.Arrays;
import java.util.Scanner;
public class PencarianData {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        
        //LINEAR SEARCH
        int i;
        int[] angka = new int[5];
        
        System.out.println("\n===Mencari Suatu Data dengan Linear Search===");
        
        // Variabel 'cari' menyimpan nilai yang ingin kita gunakan
        System.out.println("Masukkan eleman yang dicari : ");
        int cari = inputKey.nextInt();

        for (i = 0; i < angka.length; i++) {
            System.out.println("Masukkan elemen angka : ");
            angka[i] = inputKey.nextInt();
        }

        System.out.println("\nElemen-elemen nya yaitu : " + Arrays.toString(angka));
        // Variabel penanda untuk data ditemukan atau tidak
        // Menggunakan boolean : true/false
        boolean ditemukan = false;

        // Proses mencari menggunakan for dan if
        for (i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Data ditemukan! elemen " + cari + " berada di baris-" + (i+1));
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }
}
