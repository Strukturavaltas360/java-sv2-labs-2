package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {
    NumbersSum numbersSum = new NumbersSum();

    @Test
    void getSumIntNullTest() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
    }

    @Test
    void getSumIntTest() {
        assertEquals(0, numbersSum.getSum(new int[] {}));
        assertEquals(10, numbersSum.getSum(new int[] {2,2,2,4}));
    }

    @Test
    void getSumStringNullTest() {
        String[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
    }

    @Test
    void getSumStringWrongFormatTest() {
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(new String[] {"1", "2", "a"}));
    }

    @Test
    void getSumStringTest() {
        assertEquals(0, numbersSum.getSum(new String[] {}));
        assertEquals(10, numbersSum.getSum(new String[] {"2","2","2","4"}));
    }
}