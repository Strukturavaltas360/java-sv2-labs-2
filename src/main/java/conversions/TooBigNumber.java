package conversions;

public class TooBigNumber {
    public static void main(String[] args) {
        int number = 1_000_000_000;
        System.out.println(getRightResult(number));
    }

    static long getRightResult(int number) {
        return 2_147_483_647L + number;
    }
}
