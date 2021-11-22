package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void getSum() {
        Numbers numbers = new Numbers();
        assertEquals(3, numbers.getSum(new int[] {3}));
        assertEquals(10, numbers.getSum(new int[] {1, 2, 3, 4}));
    }
}