package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void createTest() {
        SimpleTime st = new SimpleTime(0,0);
        assertEquals(0, st.getHour());
        assertEquals(0, st.getMinute());

        st = new SimpleTime("23:59");
        assertEquals(23, st.getHour());
        assertEquals(59, st.getMinute());
    }

    @Test
    void createTestException() {
        InvalidTimeException ite;
        ite = assertThrows(InvalidTimeException.class, () -> new SimpleTime(24, 00));
        assertEquals(InvalidTimeReason.INVALID_HOUR.getMessage(), ite.getMessage());
        ite = assertThrows(InvalidTimeException.class, () -> new SimpleTime(0, 60));
        assertEquals(InvalidTimeReason.INVALID_MINUTE.getMessage(), ite.getMessage());
        ite = assertThrows(InvalidTimeException.class, () -> new SimpleTime(null));
        assertEquals(InvalidTimeReason.TIME_IS_NULL.getMessage(), ite.getMessage());
        ite = assertThrows(InvalidTimeException.class, () -> new SimpleTime("0:00"));
        assertEquals(InvalidTimeReason.INVALID_TIME_FORMAT.getMessage(), ite.getMessage());
    }

    @Test
    void toStringTest() {
        SimpleTime st = new SimpleTime(1,0);
        assertEquals("01:00", st.toString());
    }
}