package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        double[] mondayTemp = {0, 1, 2, 3, 4, 4, 4, 4, 4};
        double[] tuesdayTemp = {0, 1, 2, 3, 4, 4, 4, 4, 4, 5};
        int[] winningNumbers = {25, 10, 33, 75, 53};
        int[] myNumbers = {10, 25, 33, 53, 75};

        System.out.println(numberOfDaysAsString());
        System.out.println(multiplicationTableAsString(5));
        System.out.println(sameTempValues(mondayTemp, tuesdayTemp));
        System.out.println(sameTempValuesDaylight(mondayTemp, tuesdayTemp));
        System.out.println(wonLottery(winningNumbers, myNumbers));
        System.out.println(Arrays.toString(winningNumbers));
        System.out.println(Arrays.toString(myNumbers));
    }

    static String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    static String  multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0 ; i < multiplicationTable.length; i++)
            for (int j = 0; j < multiplicationTable[i].length; j++)
                multiplicationTable[i][j] = (i + 1) * (j + 1);
        return Arrays.deepToString(multiplicationTable);
    }

    static boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    static boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int minLength = min(day.length, anotherDay.length);
        double[] dayCopy = Arrays.copyOf(day, minLength);
        double[] anotherDayCopy = Arrays.copyOf(anotherDay, minLength);
        return Arrays.equals(dayCopy, anotherDayCopy);
    }

    static int min(int i1, int i2) {
        return i1 < i2 ? i1 : i2;
    }

    static boolean wonLottery(int[] winningNumbers, int[] myNumbers) {
        int[] sortedWinningNumbers = Arrays.copyOf(winningNumbers, winningNumbers.length);
        Arrays.sort(sortedWinningNumbers);
        int[] sortedMyNumbers = Arrays.copyOf(myNumbers, myNumbers.length);
        Arrays.sort(sortedMyNumbers);
        return Arrays.equals(sortedWinningNumbers, sortedMyNumbers);
    }
}
