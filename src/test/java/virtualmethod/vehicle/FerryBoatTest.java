package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {
    FerryBoat ferry = new FerryBoat(5000);
    Car car = new Car(1000, 4);
    Van van = new Van(1100, 1, 200);

    @Test
    void getGrossLoad() {
        assertEquals(5075, ferry.getGrossLoad());
        ferry.load(car);
        assertEquals(5075 + 1375, ferry.getGrossLoad());
        ferry.load(van);
        assertEquals(5075 + 1450, ferry.getGrossLoad());
    }

    @Test
    void canCarry() {
        assertTrue(ferry.canCarry(new Car(1300, 1)));
        assertFalse(ferry.canCarry(new Car(1300, 5)));
    }

    @Test
    void load() {
        assertEquals(null, ferry.getCar());
        ferry.load(car);
        assertSame(car, ferry.getCar());
        ferry.load(van);
        assertSame(van, ferry.getCar());
    }

    @Test
    void testToString() {
        assertEquals("FerryBoat{car=null}", ferry.toString());
        ferry.load(car);
        assertEquals("FerryBoat{car=Car{numberOfPassenger=4, vehicleWeight=1000}}", ferry.toString());
        ferry.load(van);
        assertEquals("FerryBoat{car=Van{cargoWeight=200, numberOfPassenger=1, vehicleWeight=1100}}", ferry.toString());
    }
}