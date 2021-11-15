package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {
    @Test
    void testModifyAngleHappppyPath() {
        Tank tank = new Tank();
        tank.modifyAngle(440);
        assertEquals(80, tank.getAngle());
        tank.modifyAngle(-520);
        assertEquals(-80, tank.getAngle());
        tank.modifyAngle(40);
        assertEquals(-40, tank.getAngle());
        tank.modifyAngle(70);
        assertEquals(30, tank.getAngle());
    }

    @Test
    void testModifyAngleException() {
        Tank tank = new Tank();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(90));
        assertEquals("Nem lehet a csövet ebbe az irányba állítani!", exception.getMessage());

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(-85));
        assertEquals("Nem lehet a csövet ebbe az irányba állítani!", exception2.getMessage());
    }

}