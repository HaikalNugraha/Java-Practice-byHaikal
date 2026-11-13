public class PengenalanArray {
    public static void main(String[] args) {
        
        // Menyimmpan data menggunakan variable biasa
        int nilai1 = 10;
        int nilai2 = 11;
        int nilai3 = 12;

        System.out.println("\n==========Mengunakan Variabel Biasa==========");
        System.out.println(nilai1);
        System.out.println(nilai2);
        System.out.println(nilai3);

        // Menyimpan data menggunakan array
        int[] nilai = {10, 11, 12};

        System.out.println("\n==========Mengunakan Array==========");
        System.out.println(nilai[0]);
        System.out.println(nilai[1]);
        System.out.println(nilai[2]);
    }
}