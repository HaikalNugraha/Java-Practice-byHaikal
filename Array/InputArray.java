import java.util.Scanner;
import java.util.Arrays;

public class InputArray {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        int i;

        int[] nilai = new int[5];
        for (i = 0; i<nilai.length; i++) {
            System.out.println("Masukkan elemen nilai : ");
            nilai[i] = inputKey.nextInt();
        }

        
        // Menampilkan Elemen Berdasarkan Inputan
        for (i = 0; i<nilai.length; i++) {
            System.out.println("Nilai ke-" + (i+1) + " adalah " + nilai[i]);            
        }
        System.out.println("Elemen array adalah : \n" + Arrays.toString(nilai));
        
        inputKey.nextLine();
        String[] nama = new String[4];
        for (i = 0; i<nama.length; i++) {
            System.out.println("Masukkan nama : ");
            nama[i] = inputKey.nextLine();
        }

        for (i = 0; i<nama.length; i++) {
            System.out.println("Nama list ke-" + (i+1) + " adalah " + nama[i]);            
        }
        System.out.println("Nama-nama di list : " + Arrays.toString(nama));
    }
}
