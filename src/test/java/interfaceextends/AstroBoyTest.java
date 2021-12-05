package interfaceextends;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstroBoyTest {
    @Test
    void moveToValidPointTest() {
        AstroBoy astroBoy = new AstroBoy(new Point(0, 0, 0));
        astroBoy.moveTo(new Point(1, 0, 0));
        assertEquals(1, astroBoy.getPosition().getX());
        assertEquals(2, astroBoy.getPath().size());
    }

    @Test
    void moveToInvalidPointTest() {
        assertThrows(IllegalArgumentException.class, () ->
                new AstroBoy(new Point(0, 0, 10)));
        AstroBoy astroBoy = new AstroBoy(new Point(0, 0, 0));
        assertThrows(IllegalArgumentException.class, () ->
                astroBoy.moveTo(new Point(1, 0, 10)));
    }

    @Test
    void rotateTest() {
        AstroBoy astroBoy = new AstroBoy(new Point(0, 0, 0));
        astroBoy.rotate(200);
        astroBoy.rotate(200);
        assertEquals(40, astroBoy.getAngle());
        astroBoy.rotate(-200);
        assertEquals(200, astroBoy.getAngle());
        astroBoy.rotate(-3620);
        assertEquals(180, astroBoy.getAngle());
    }


    @Test
    void liftTo() {
        AstroBoy astroBoy = new AstroBoy(new Point(0, 0, 0));
        astroBoy.liftTo(10);
        assertEquals(0, astroBoy.getPosition().getX());
        assertEquals(0, astroBoy.getPosition().getY());
        assertEquals(10, astroBoy.getPosition().getZ());
        assertEquals(2, astroBoy.getPath().size());
        assertEquals(astroBoy.getPosition(), astroBoy.getPath().get(1));
    }

    @Test
    void fastMoveTo() {
        AstroBoy astroBoy = new AstroBoy(new Point(0, 0, 0));
        astroBoy.fastMoveTo(new Point(10,10,0));
        assertEquals(4, astroBoy.getPath().size());
        assertEquals(new Point(0, 0, 5), astroBoy.getPath().get(1));
        assertEquals(new Point(10, 10, 5), astroBoy.getPath().get(2));
        assertEquals(astroBoy.getPosition(), astroBoy.getPath().get(3));
    }
}