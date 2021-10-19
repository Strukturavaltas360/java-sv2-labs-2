package looptypes;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 3, 5, 7, 9};
        printSums(numbers);
    }

    static void printSums(int[] numbers) {
        for (int i = 1; i < numbers.length; i++)
            System.out.print((numbers[i - 1] + numbers[i]) + " ");
    }
}
