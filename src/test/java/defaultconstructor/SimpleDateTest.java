package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    @Test
    void setDate() {
        SimpleDate sd = new SimpleDate();
        sd.setDate(2020, 2, 29);
        sd.setDate(1900, 1, 1);
        sd.setDate(2020, 12, 31);
        assertEquals(2020, sd.getYear());
        assertEquals(12, sd.getMonth());
        assertEquals(31, sd.getDay());
    }

    @Test
    void setDateException() {
        SimpleDate sd = new SimpleDate();
        assertThrows(IllegalArgumentException.class, () -> sd.setDate(1899, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> sd.setDate(1999, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> sd.setDate(1999, 13, 1));
        assertThrows(IllegalArgumentException.class, () -> sd.setDate(1999, 2, 29));
        assertThrows(IllegalArgumentException.class, () -> sd.setDate(1999, 4, 31));
        assertThrows(IllegalArgumentException.class, () -> sd.setDate(1999, 5, 32));
    }
}