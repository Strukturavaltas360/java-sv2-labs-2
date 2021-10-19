package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        System.out.println(Arrays.toString(changeToZero(numbers)));
    }
    static int[] changeToZero(int[] numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);

        int backCounter = 0;
        for (int i = result.length - 1; i >= 0; i--)
            if (backCounter++ % 3 == 0) result[i] = 0;

        return result;
    }
}
