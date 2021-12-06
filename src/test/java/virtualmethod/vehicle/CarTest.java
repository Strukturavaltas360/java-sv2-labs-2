package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getGrossLoad() {
        assertEquals(2075, new Car(1700, 4).getGrossLoad());
    }

    @Test
    void testToString() {
        assertEquals("Car{numberOfPassenger=4, vehicleWeight=1700}", new Car(1700, 4).toString());
    }
}