package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(4, 5);

    @Test
    void distance() {
        assertEquals(5, p1.distance(p2));
    }
}