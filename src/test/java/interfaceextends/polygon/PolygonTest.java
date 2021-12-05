package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {
    Polygon p6 = new Polygon(1, 6);

    @Test
    void getPerimeter() {
        assertEquals(6, p6.getPerimeter());
    }

    @Test
    void getNumberOfDiagonalsFromOneVertex() {
        assertEquals(3, p6.getNumberOfDiagonalsFromOneVertex());
    }

    @Test
    void getNumberOfAllDiagonals() {
        assertEquals(9, p6.getNumberOfAllDiagonals());
    }
}