package exceptions.sum;

public class NumbersSum {
    int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers is null!");
        }
        int result = 0;
        for (int number: numbers) {
            result += number;
        }
        return result;
    }

    int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers is null!");
        }
        int result = 0;
        for (String st : numbers) {
            try {
                result += Integer.parseInt(st);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Can not convert to integer: " + st, nfe);
            }
        }
        return result;
    }
}
