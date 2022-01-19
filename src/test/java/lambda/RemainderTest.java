package lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {
    Remainder remainder = new Remainder();

    @Test
    void changeNumbersToRemainders() {
        assertEquals(List.of(0, 1, 1, 0, 2, 0),
                remainder.changeNumbersToRemainders(List.of(45, 13, 64, 51, 92, 33), 3));
    }
}