package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VanTest {

    @Test
    void getGrossLoad() {
        assertEquals(1200 + 5 * 75 + 1222,
                new Van(1200, 4, 1222).getGrossLoad());
    }

    @Test
    void testToString() {
        assertEquals("Van{cargoWeight=1222, numberOfPassenger=4, vehicleWeight=1200}",
                new Van(1200, 4, 1222).toString());
    }
}