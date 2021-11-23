package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    Position p1 = new Position(1, 1);
    Position p2 = new Position(4, 5);

    @Test
    void createTest() {
        assertEquals(4, p2.getPosX());
        assertEquals(5, p2.getPosY());
    }

    @Test
    void distanceFrom() {
        assertEquals(5, p1.distanceFrom(p2), 0.001);
    }
}