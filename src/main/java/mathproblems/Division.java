package mathproblems;

public class Division {
    public static void main(String[] args) {
        getDivisors(12);
        getRightNumbers(new int[] {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10});
    }

    static void getDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.println(number + " osztója: " + i);
        }
    }

    static void getRightNumbers(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % i == 0) System.out.print(numbers[i] + " ");
        }
    }
}
