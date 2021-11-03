package controladvanced.labels;

public class Labels {
    public int[][] getTableOfNumbers(int number) {
        int[][] table = new int[number][number];
        table[0][0] = 1;
        FORI: for (int i = 0; i < number; i++) {
            FORJ: for (int j = 0; j < number; j++) {
                if (j == 3) continue FORI;
                table[i][j] = (i + 1) + (j + 1);
                if (table[i][j] > 6) break FORI;
            }
        }
        return table;
    }
}
