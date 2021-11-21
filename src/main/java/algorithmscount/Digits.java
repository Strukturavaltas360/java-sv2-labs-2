package algorithmscount;

public class Digits {
    public int getCountOfNumbers() {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int digit1 = i % 10;
            int digit10 = i / 10;
            if (Math.abs(digit1 - digit10) == 5) {
                counter++;
            }
        }
        return counter;
    }
}
