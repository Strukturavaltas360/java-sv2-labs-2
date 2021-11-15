package introexceptiontrace;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        Change change = new Change();
        System.out.println(Arrays.toString(change.changeNumbers())); //Exception
    }

    public int[] changeNumbers() {
        int[] numbers = new RandomOperations().getNumbers(); //Exception
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        return numbers;
    }
}
