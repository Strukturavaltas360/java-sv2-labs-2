package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitEvensTest {

    @Test
    void getSumTest() {
        TwoDigitEvens twoDigitEvens = new TwoDigitEvens(10);
        assertEquals(1 + 3 + 7 + 9, twoDigitEvens.getSum());
        assertEquals(10 * 10 / 4 - 5, twoDigitEvens.getSum());
        twoDigitEvens = new TwoDigitEvens(13);
        assertEquals(1 + 3 + 7 + 9 + 11 + 13, twoDigitEvens.getSum());
        assertEquals(14 * 14 / 4 - 5, twoDigitEvens.getSum());
        twoDigitEvens = new TwoDigitEvens();
        assertEquals(100 * 100 / 4 - 50 * 10, twoDigitEvens.getSum());
    }
}