package arrayofarrays;

public class Triangular {
    public static void main(String[] args) {
        int[][] triMatrix = triangularMatrix(4);

        for (int[] innerArray: triMatrix) {
            String line = "";
            for (int elem: innerArray) {
                line += elem + " ";
            }
            System.out.println(line);
        }
    }

    static int[][] triangularMatrix(int size) {
        int[][] triMatrix = new int[size][];
        for (int i = 0; i < triMatrix.length; i++) {
            triMatrix[i] = new int[i + 1];
            for (int j = 0; j < triMatrix[i].length; j++) triMatrix[i][j] = i;
        }
        return triMatrix;
    }
}
