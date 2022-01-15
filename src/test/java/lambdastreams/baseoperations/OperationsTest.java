package lambdastreams.baseoperations;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
    Operations operations = new Operations(List.of(15, 20, 15, 3, -4));
    Operations operations2 = new Operations(List.of(15, 20, 15, 3));

    @Test
    void min() {
        assertEquals(-4, operations.min().get());
    }

    @Test
    void sum() {
        assertEquals(49, operations.sum());
    }

    @Test
    void isAllPositive() {
        assertFalse(operations.isAllPositive());
        assertTrue(operations2.isAllPositive());
    }

    @Test
    void getDistinctElements() {
        assertEquals(Set.of(-4, 3, 15, 20), operations.getDistinctElements());
    }
}