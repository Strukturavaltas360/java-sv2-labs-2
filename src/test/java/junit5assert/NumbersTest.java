package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {
    @Test
    void testGetEvenNumbers() {
        int[] input = {2, 8, 5, 6, 2, 3, 9};
        int[] expectedResult = {2, 8, 0, 6, 2, 0, 0};
        Numbers numbers = new Numbers();
        assertArrayEquals(expectedResult, numbers.getEvenNumbers(input));
    }
}
