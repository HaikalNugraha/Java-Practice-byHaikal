package Perulangan;
import java.util.Scanner;
public class LoopWhile {
    public static void main (String[] args){
        int pilihan=0;
        int bil1=0;
        int bil2=0;
        int hasil=0;

        Scanner inputKey = new Scanner(System.in);
        Scanner inputBil = new Scanner(System.in);
        
        while (pilihan!=4) {
            System.out.println("-------------------------");
            System.out.println("       MENU PROGRAM      ");
            System.out.println(" 1.PENJUMLAHAN 2 BILANGAN");
            System.out.println(" 2.PENGURANGAN 2 BILANGAN");
            System.out.println("  3.PERKALIAN 2 BILANGAN ");
            System.out.println("      4.EXIT PROGRAM     ");
            System.out.println("-------------------------");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = inputKey.nextInt();
            if (pilihan==1) {
                System.out.println ("Program Penjumlahan 2 Bilangan ");
                System.out.print("Masukkan Bilangan 1 : ");
                bil1=inputBil.nextInt();
                System.out.print("Masukkan Bilangan 2 : ");
                bil2=inputBil.nextInt();
                hasil=bil1+bil2;
                System.out.println("Hasil " +bil1 + " + " + bil2 + " = " + hasil);  
                System.out.println();
            } else if (pilihan==2){
                System.out.println ("Program Pengurangan 2 Bilangan ");
                System.out.println("Masukkan bilangan 1 : ");
                bil1=inputBil.nextInt();
                System.out.println("Masukkan bilangan 2 : ");
                bil2=inputBil.nextInt();
                hasil=bil1-bil2;
                System.out.println("Hasil " + bil1 + " - " + bil2 + " = " + hasil);  
                System.out.println();
            } else if (pilihan==3){
                System.out.println ("Program Perkalian 2 Bilangan ");
                System.out.println("Masukkan bilangan 1 : ");
                bil1=inputBil.nextInt();
                System.out.println("Masukkan bilangan 2 : ");
                bil2=inputBil.nextInt();
                hasil=bil1*bil2; 
                System.out.println("Hasil " + bil1 + " * " + bil2 + " = " + hasil);  
                System.out.println(); 
            } else {
                System.out.println ("Anda Keluar Program ");
            }
        }
    }
}