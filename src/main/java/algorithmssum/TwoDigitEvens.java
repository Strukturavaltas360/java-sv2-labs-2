package algorithmssum;

public class TwoDigitEvens {
    private int maxNumber;

    public int getSum() {
        int sum = 0;
        for (int i = 1; i <= maxNumber; i += 2) {
            if (i % 5 > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public TwoDigitEvens() {
        this.maxNumber = 99;
    }

    public TwoDigitEvens(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
