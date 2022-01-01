package exceptionmulticatch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {
    BinaryStringConverter bsc = new BinaryStringConverter();

    @Test
    void binaryStringToBooleanArrayTest() {
        boolean[] actual = bsc.binaryStringToBooleanArray("0110");
        assertEquals(4, actual.length);
        assertTrue(actual[1]);
        assertFalse(actual[3]);
    }

    @Test
    void binaryStringToBooleanArrayNullTest() {
        NullPointerException npe = assertThrows(NullPointerException.class, () -> bsc.binaryStringToBooleanArray(null));
        assertEquals("The string must not be null!", npe.getMessage());
    }

    @Test
    void binaryStringToBooleanArrayInvalidTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> bsc.binaryStringToBooleanArray("012"));
        assertEquals("Only 0 and 1 are allowed (2)!", iae.getMessage());
    }

    @Test
    void booleanArrayToBinaryStringTest() {
        String actual = bsc.booleanArrayToBinaryString(new boolean[] {false, true, true, false});
        assertEquals("0110", actual);
    }

    @Test
    void booleanArrayToBinaryStringNullTest() {
        NullPointerException npe = assertThrows(NullPointerException.class, () -> bsc.booleanArrayToBinaryString(null));
        assertEquals("The array must not be null!", npe.getMessage());
    }
}