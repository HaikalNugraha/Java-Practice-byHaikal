package Perulangan;
/* Program Loop For */
import java.util.Scanner;
public class LoopFor {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);

        // perhitungan maju
        System.out.println("Masukkan Jumlah Bilangan : ");
        int jumlahPerulangan = inputKey.nextInt();
        for (int i = 4; i<=jumlahPerulangan; i += 2){
            System.out.println("Perulangan ke " + i);
        }

        // perhitungan mundur
        System.out.println("Masukkan Jumlah Bilangan : ");
        int angka = inputKey.nextInt();
        for (int i = 21; i>=angka; i--){
            System.out.println("Perulangan ke " + i);
        }

        // Mencetak hello
        System.out.println("Mencetak Hello : ");
        int jumlahHalo = inputKey.nextInt();
        for (int i = 1; i<=jumlahHalo; i++){
            System.out.println("Hello");
        }
    }
}