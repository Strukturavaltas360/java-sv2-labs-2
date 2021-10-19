package arrayofarrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        printArrayOfArrays(intArray);
    }

    static void printArrayOfArrays(int[][] a) {
        for (int[] innerArray: a) {
            String line = "";
            for (int elem: innerArray) {
                line += elem + " ";
            }
            System.out.println(line);
        }
    }
}
