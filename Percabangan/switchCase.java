/* Program Percabangan Menggunakan Switch Case 
nama : Haikal Nugraha
NIM : 2615354031*/

import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        System.out.print("Masukkan bilangan hari dalam angka : ");
        int angka = inputKey.nextInt();
        String hari="";
        switch (angka){
        case 1:
            hari = "Senin";
            break;
        case 2:
            hari = "Selasa";
            break;
        case 3:
            hari = "Rabu";
            break;
        case 4:
            hari = "Kamis";
            break;
        case 5:
            hari = "Jumat";
            break;
        case 6:
            hari = "Sabtu";
            break;
        case 7:
            hari = "Minggu";
            break;
        default:
            hari = "Tidak terdefinisi";
            break;
        }       
    System.out.println("Hari yang anda inputkan adalah : " + hari);
    }
}