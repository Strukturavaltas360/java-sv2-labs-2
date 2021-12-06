package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void of() {
        assertEquals(Bicycle.class, Vehicle.of(2).getClass());
        assertEquals(Car.class, Vehicle.of(4).getClass());
        assertThrows(IllegalArgumentException.class, ()-> Vehicle.of(3));
    }
}