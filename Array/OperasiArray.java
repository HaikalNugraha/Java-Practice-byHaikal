import java.util.Arrays;;
public class OperasiArray {
    public static void main(String[] args) {
        // OPERASI PADA ARRAY
        int[] arrayAngka1 = {1, 2, 3, 4, 5};

        // Merubah array menjadi string
        System.out.println("\n====Mengubah Array Menjadi String====\n");
        printArray(arrayAngka1);

        // Mengcopy array
        System.out.println("\n====Mengcopy Array====\n");
        int[] arrayAngka2 = new int[5];
    }

    static void printArray(int[] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}
 