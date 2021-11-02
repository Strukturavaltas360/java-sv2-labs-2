package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Titanic", 1912, 269.1);
    }

    @Test
    void testName() {
        assertEquals("Titanic", ship.getName());
        assertNotEquals("Balaton", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1912, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1912);
        assertFalse(ship.getYearOfConstruction() > 2000);
    }

    @Test
    void testLength() {
        assertEquals(270, ship.getLength(), 1);
    }

    @Test
    void testNull() {
        Ship ship2 = null;
        assertNull(ship2);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship ship2 = ship;
        assertSame(ship, ship2);
    }

    @Test
    void testNotSameObjects() {
        Ship ship2 = new Ship("Titanic", 1912, 269.1);
        assertNotSame(ship, ship2);
    }
}
