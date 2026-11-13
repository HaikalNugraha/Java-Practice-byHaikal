/* Program Percabangan IF
Nama : Haikal Nugraha
Nim : 2615354031 */

import java.util.Scanner;
public class IfElse {
    public static void main (String[] args){
        // Deklarasi konstanta
        // final double PI=3.14;
        Scanner inputKey = new Scanner (System.in);
        // Input suatu bilangan
        System.out.print("Masukkan bilangan : ");
        int bilPertama = inputKey.nextInt();
        if (bilPertama > 0){
            System.out.println("Bilangan " + bilPertama + " adalah bilangan positif");
        }
        else if (bilPertama < 0){
            System.out.println("Bilangan" + bilPertama + " adalah bilangan negatif");
        }
        else {
            System.out.println("Bilangan " + bilPertama + " adalah bilangan nol ");
        }

        if (bilPertama % 2 == 0){
            System.out.println("Bilangan itu juga adalah bilangan genap");
        }
        else {
            System.out.println("Bilangan itu juga adalah bilangan ganjil");
        }
    }
}