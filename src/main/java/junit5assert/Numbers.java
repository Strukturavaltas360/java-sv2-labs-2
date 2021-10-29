package junit5assert;

import java.util.Arrays;

public class Numbers {
    public int[] getEvenNumbers(int[] numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i] % 2 == 1) {
                result[i] = 0;
            }
        }
        return result;
    }
}
