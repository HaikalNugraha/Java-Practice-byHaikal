public class KonsepDasarArray {
    public static void main(String[] args) {
        // Pengenalan Indeks

        //     indeks [0] [1]  [3] [4]
        int[] angka = {54, 52, 13, 64};

        System.out.println("Elemen di indeks 0 adalah " + angka[0]);
        System.out.println("Elemen di indeks 1 adalah " + angka[1]);
        System.out.println("Elemen di indeks 2 adalah " + angka[2]);
        System.out.println("Elemen di indeks 4 adalah " + angka[3]);

        // Pengenalan Length
        System.out.println("Jumlah elemen pada array angka sebanyak " +  angka.length);
        System.out.println("Elemen awal yaitu " + angka[0]);
        System.out.println("Elemen akhir yaitu " + angka[angka.length-1]);
    }
}

/*Indeks array di Java selalu dimulai dari angka 0
length digunakan untuk mengetahui berapa banyak elemen yang dimiliki oleh sebuah array.*/