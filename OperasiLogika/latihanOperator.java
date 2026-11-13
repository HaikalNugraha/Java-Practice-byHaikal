public class latihanOperator {
    public static void main(String[] args) {
        // Operator Aritmatika
        int a = 3;
        int b = 8;

        int hasilTambah = a + b;
        int hasilKurang = a - b;
        int hasilKali = a * b;

        System.out.println(hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Penjumlahan : " + hasilTambah);
        System.out.println(hasilKali);

        // Operator Logika
        boolean kondisi1 = true;
        boolean kondisi2 = false;

        boolean hasill = kondisi1 && kondisi2;

        System.out.println(hasill);
        System.out.println("Hasil Logika Or : " + (kondisi1 || kondisi2));
        System.out.println("Hasil logika Not : " + !kondisi1);

        // Real Study Case
        boolean sudahMembayar = true;
        boolean sudahRegistrasi = true;

        boolean mengikutiUjian = sudahMembayar && sudahRegistrasi;
        System.out.println("Seseorang boleh mengikuti ujian jika sudah membayar dan sudah melakukan registrasi : " + mengikutiUjian);
    }   
}