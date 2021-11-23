package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time time1 = new Time(13, 3, 10);
    Time time2 = new Time(13, 4, 1);

    @Test
    void isEqual() {
        assertFalse(time1.isEqual(time2));
        assertTrue(time1.isEqual(13, 3, 10));
    }

    @Test
    void isEarlier() {
        assertTrue(time1.isEarlier(time2));
        assertFalse(time1.isEarlier(13, 2, 43));
    }
}