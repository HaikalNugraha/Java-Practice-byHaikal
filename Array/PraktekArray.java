import java.util.Scanner;
public class PraktekArray {
    public static void main (String[] args) {
        program3();
    }

    // program 1
    static void program1() {
        int[] nilai = {89,76, 89, 37, 88, 56};
        int sumNilai=0;
        double rataRata = 0;
        
        for (int i = 0; i<nilai.length; i++) {
            sumNilai += nilai[i]; //sumNilai = sumNilai + nilai[i]
            System.out.println("Iterasi i = " + i + "variabel sumNilai = " + sumNilai);
        }

        rataRata=(double)sumNilai / nilai.length;
        System.out.println("Jumlah data : " + nilai.length);
        System.out.println("Summary Data :" + sumNilai);
        System.out.println("Rata - rata nilai adalah " + rataRata);
    }   

    // program 2
    static void program2() {
        Scanner inputKey = new Scanner(System.in);

        int[] nilai = new int[5];

        for (int i = 0; i<nilai.length; i++) {
            System.out.println("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = inputKey.nextInt();
        }

        int sumNilai = 0;
        double rataRata = 0;

        for (int i = 0; i < nilai.length; i++) {
            sumNilai += nilai[i];

            System.out.println("iterasi i = " + i + " Variabel sumNilai = " + sumNilai);
        }

        rataRata = (double) sumNilai / nilai.length;

        System.out.println("Jumlah data : " + nilai.length);
        System.out.println("Summary data : " + sumNilai);
        System.out.println("Rata-rata nilai adalah " + rataRata);
    }

    // PROGRAM 3
    static void program3() {
        Scanner input = new Scanner(System.in);

        int[] jumlahBotol = new int[5];
        int total = 0;
        int terbanyak;
        int indeksTerbanyak = 0;

        // Input jumlah botol
        for (int i = 0; i < jumlahBotol.length; i++) {
            System.out.print("Jumlah botol titik " + (i + 1) + ": ");
            jumlahBotol[i] = input.nextInt();

            total = total + jumlahBotol[i];
        }

        // Mencari jumlah botol terbanyak
        terbanyak = jumlahBotol[0];

        for (int i = 1; i < jumlahBotol.length; i++) {
            if (jumlahBotol[i] > terbanyak) {
                terbanyak = jumlahBotol[i];
                indeksTerbanyak = i;
            }
        }

        // Menampilkan seluruh data
        System.out.println("\nData pengumpulan botol:");

        for (int i = 0; i < jumlahBotol.length; i++) {
            System.out.println(
                "Titik " + (i + 1) + ": " + jumlahBotol[i]
            );
        }

        System.out.println("Total botol: " + total);
        System.out.println("Titik pengumpulan terbanyak: "
                           + (indeksTerbanyak + 1));
        System.out.println("Jumlah terbanyak: " + terbanyak);

        input.close();
    }
}