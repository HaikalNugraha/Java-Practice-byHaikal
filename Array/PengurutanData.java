import java.util.Arrays;
import java.util.Scanner;

public class PengurutanData {
    public static void main(String[] args) {
        // Bubble Short dengan Ascending (Menaik)
        int[] angka2 = {5, 7, 9, 2, 4};
        int i;
        int j;
        
        System.out.println("\nSebelum disortir : " + Arrays.toString(angka2));

        /*  Mengapa dikurangi 1? Karena satu putaran terakhir 
        yang seandainya dilakukan lagi sebenarnya tidak diperlukan.*/
        for (i = 0; i < angka2.length - 1; i++) {
            for (j = 0; j < angka2.length - 1 - i; j++) {
                if (angka2[j] > angka2[j + 1]) {
                    // contoh
                    // angka2[j] = 9
                    // angka2[j + 1] = 5
                    // artinya variabel 'sementara' bernilai = 9
                    // angka2[j] = angka2 [j+1], artinya angka2[j] sekarang bernilai 5
                    // angka2[j + 1] = sementara; artinya angka2[j+1] sekarang bernilai 9
                    int sementara = angka2[j];  
                    angka2[j] = angka2 [j +1];
                    angka2[j + 1] = sementara;
                } 
            }
        }
        System.out.println("Setelah disortir : " + Arrays.toString(angka2));


        // Menggunakan input dari pengguna
        Scanner inputjumlahAngka = new Scanner(System.in);
        Scanner inputelemenAngka = new Scanner(System.in);

        System.out.println("\n======== INI MENGGUNAKAN INPUT ========");
        System.out.println("Masukkan jumlah elemen array : ");
        int jumlah = inputjumlahAngka.nextInt();
        
        int[] angka3 = new int[jumlah];
        for (i = 0; i < angka3.length; i++) {
            System.out.println("Masukkan elemen-elemen angka : ");
            angka3[i] = inputelemenAngka.nextInt();
        }
        
        // INI SEBELUM PROSES DIURUTKAN
        System.out.println("Elemen sebelum diurutkan : " + Arrays.toString(angka3));

        // PROSES MENGURUTKAN
        for (i = 0; i < angka3.length - 1; i++) {
            for (j = 0; j < angka3.length - 1 - i; j++) {
                if (angka3[j] > angka3[j +1]) {
                    int sementara = angka3[j];
                    angka3[j] = angka3 [j + 1];
                    angka3 [j + 1] = sementara;
                }
            }
        }

        // INI SETELAH PROSES DIURUTKAN
        System.out.println("Elemen setelah diurutkan : " + Arrays.toString(angka3));

        inputjumlahAngka.close();
        inputelemenAngka.close();
    }
}


/* Sorting adalah proses mengurutkan elemen-elemen dalam array berdasarkan urutan tertentu.
 Bubble Sort bekerja dengan membandingkan dua elemen yang bersebelahan.
 Jika elemen sebelah kiri lebih besar daripada elemen sebelah kanan, keduanya ditukar. */ 

/*======== NOTES ========== 
Java menjalankan instruksi program secara berurutan dari atas ke bawah, selama tidak ada 
struktur yang mengubah alur eksekusinya, seperti percabangan, perulangan, 
pemanggilan method, atau return.
Hal ini berkaitan dengan konsep IPO (Input – Process – Output*/