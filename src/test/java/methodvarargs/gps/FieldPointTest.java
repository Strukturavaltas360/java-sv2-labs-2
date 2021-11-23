package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {
    LocalDateTime time1 = LocalDateTime.of(2021, 01, 01, 10, 03, 2);
    LocalDateTime time2 = LocalDateTime.of(2021, 01, 01, 10, 32, 21);
    FieldPoint fieldPoint = new FieldPoint(time1, 47.1, 19.5);

    @Test
    void createTest() {
        assertEquals(time1, fieldPoint.getTimeOfSetting());
        assertEquals(47.1, fieldPoint.getLatitude());
        assertEquals(19.5, fieldPoint.getLongitude());
        assertNull(fieldPoint.getTimeOfLogging());
    }

    @Test
    void setTimeOfLogging() {
        fieldPoint.setTimeOfLogging(time2);
        assertEquals(time2, fieldPoint.getTimeOfLogging());
    }
}