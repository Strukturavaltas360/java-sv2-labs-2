package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testToString() {
        assertEquals("Vehicle{vehicleWeight=1000}", new Vehicle(1000).toString());
    }

    @Test
    void getGrossLoad() {
        assertEquals(1075, new Vehicle(1000).getGrossLoad());
    }
}