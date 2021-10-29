package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName() {
        Dragon haromfeju = new Dragon("Háromfejű", 3, 3);
        assertEquals("Háromfejű", haromfeju.getName());
        assertNotEquals("Hétfejű", haromfeju.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon haromfeju = new Dragon("Háromfejű", 3, 3);
        assertEquals(3, haromfeju.getNumberOfHeads());
        assertTrue(haromfeju.getNumberOfHeads() > 1);
        assertFalse(haromfeju.getNumberOfHeads() == 7);
    }

    @Test
    void testHeight() {
        Dragon haromfeju = new Dragon("Háromfejű", 3, 10.0/3);
        assertEquals(3.3, haromfeju.getHeight(), 0.05);
    }

    @Test
    void testNull() {
        Dragon haromfeju = new Dragon("Háromfejű", 3, 3);
        Dragon fakedragon = null;
        assertNull(fakedragon);
        assertNotNull(haromfeju);
    }

    @Test
    void testSameObjects() {
        Dragon haromfeju = new Dragon("Háromfejű", 3, 3);
        Dragon masik = haromfeju;
        assertSame(haromfeju, masik);
    }

    @Test
    void testNotSameObjects() {
        Dragon haromfeju = new Dragon("Háromfejű", 3, 3);
        Dragon haromfeju2 = new Dragon("Háromfejű", 3, 3);
        assertNotSame(haromfeju, haromfeju2);
    }

}
