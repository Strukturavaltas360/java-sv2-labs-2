package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {
    SimpleTime time1 = new SimpleTime(9, 2);
    SimpleTime time2 = new SimpleTime(10);
    SimpleTime time3 = new SimpleTime(time1);

    @Test
    void createTest() {
        assertEquals(9, time1.getHours());
        assertEquals(2, time1.getMinutes());
        assertEquals(10, time2.getHours());
        assertEquals(0, time2.getMinutes());
        assertEquals(9, time3.getHours());
        assertEquals(2, time3.getMinutes());
    }

    @Test
    void testToString() {
        assertEquals("9:02", time1.toString());
        assertEquals("10:00", time2.toString());
        assertEquals("14:20", new SimpleTime(14, 20).toString());
    }

    @Test
    void getDifference() {
        assertEquals(-58, time1.getDifference(time2));
    }
}