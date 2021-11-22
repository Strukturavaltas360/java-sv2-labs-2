package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void createTest() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> new Car("", "Golf", 2000));
        assertEquals("Hiba: a márka üres!", exception.getMessage());
        exception = assertThrows(IllegalStateException.class, () -> new Car("VW", "Golf", 2022));
        assertEquals("Hiba: a gyártási év jövőbeli!", exception.getMessage());
    }

}