package arrayofarrays;

public class DailyValues {
    public static void main(String[] args) {
        int[][] matrix = getValues();

        for (int[] innerArray: matrix) {
            String line = "";
            for (int elem: innerArray) {
                line += elem + " ";
            }
            System.out.println(line);
        }
    }

    static int[][] getValues() {
        int[][] valuesMatrix = new int[12][];
        for (int month = 1; month < valuesMatrix.length + 1; month++) {
            if (month == 2) valuesMatrix[month - 1] = new int[28];
            else if (month == 1 | month == 3 | month == 5 | month == 7 |
                    month == 8 | month == 10 | month == 12) valuesMatrix[month - 1] = new int[31];
            else valuesMatrix[month - 1] = new int[30];
        }
        return valuesMatrix;
    }
}
