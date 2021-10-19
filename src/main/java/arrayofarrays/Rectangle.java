package arrayofarrays;

public class Rectangle {
    public static void main(String[] args) {
        int[][] matrix = rectangularMatrix(4);

        for (int[] innerArray: matrix) {
            String line = "";
            for (int elem: innerArray) {
                line += elem + " ";
            }
            System.out.println(line);
        }
    }

    static int[][] rectangularMatrix(int size) {
        int[][] rectMatrix = new int[size][size];
        for (int i = 0; i < rectMatrix.length; i++) {
            for (int j = 0; j < rectMatrix[i].length; j++) rectMatrix[i][j] = i;
        }
        return rectMatrix;
    }
}
