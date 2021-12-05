package interfaceextends;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C3P0Test {

    @Test
    void moveToValidPointTest() {
        C3P0 c3p0 = new C3P0(new Point(0, 0, 0));
        c3p0.moveTo(new Point(1, 0, 0));
        assertEquals(1, c3p0.getPosition().getX());
        assertEquals(2, c3p0.getPath().size());
    }

    @Test
    void fastMoveToInvalidPoinTest() {
        assertThrows(IllegalArgumentException.class, () -> new C3P0(new Point(0, 0, 10)));
        C3P0 c3p0 = new C3P0(new Point(0, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> c3p0.fastMoveTo(new Point(0, 0, 10)));
    }

    @Test
    void rotateTest() {
        C3P0 c3p0 = new C3P0(new Point(0, 0, 0));
        c3p0.rotate(200);
        c3p0.rotate(200);
        assertEquals(40, c3p0.getAngle());
        c3p0.rotate(-200);
        assertEquals(200, c3p0.getAngle());
        c3p0.rotate(-3620);
        assertEquals(180, c3p0.getAngle());
    }
}