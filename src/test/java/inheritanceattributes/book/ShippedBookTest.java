package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {
    ShippedBook shippedBook = new ShippedBook("Gyűrűk ura", 3000, 1200);

    @Test
    void order() {
        assertEquals(7200, shippedBook.order(2));
    }

    @Test
    void testToString() {
        assertEquals("Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft", shippedBook.toString());
    }
}