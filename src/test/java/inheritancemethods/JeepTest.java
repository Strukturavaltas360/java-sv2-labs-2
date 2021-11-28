package inheritancemethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {
    Jeep jeep = new Jeep(8, 20, 50, 20, 0);
    @Test
    void modifyFuelAmount() {
        jeep.modifyFuelAmount(69);
        assertEquals(50, jeep.getFuel());
        assertEquals(19, jeep.getExtraFuel());
        assertThrows(IllegalArgumentException.class, ()-> jeep.modifyFuelAmount(71));
        assertThrows(IllegalArgumentException.class, ()-> jeep.modifyFuelAmount(-1));
    }

    @Test
    void drive() {
        jeep.modifyFuelAmount(69);
        jeep.drive(800);
        assertEquals(5, jeep.getFuel());
        assertEquals(0, jeep.getExtraFuel());
        assertThrows(IllegalArgumentException.class, ()-> jeep.drive(70));
    }
}