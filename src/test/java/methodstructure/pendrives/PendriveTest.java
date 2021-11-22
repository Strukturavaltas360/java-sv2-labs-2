package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {
    Pendrive pendrive1 = new Pendrive("Generic", 4, 1500);
    Pendrive pendrive2 = new Pendrive("Generic", 8, 2999);

    @Test
    void createTest() {
        assertEquals("Generic", pendrive1.getName());
        assertEquals(4, pendrive1.getCapacity());
        assertEquals(1500, pendrive1.getPrice());
    }

    @Test
    void isCheaperThan() {
        assertTrue(pendrive1.isCheaperThan(pendrive2));
    }

    @Test
    void comparePricePerCapacity() {
        assertEquals(1, pendrive1.comparePricePerCapacity(pendrive2));
    }

    @Test
    void risePrice() {
        pendrive1.risePrice(5);
        assertEquals(1575, pendrive1.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("name: Generic, capacity: 4, price: 1500", pendrive1.toString());
    }
}