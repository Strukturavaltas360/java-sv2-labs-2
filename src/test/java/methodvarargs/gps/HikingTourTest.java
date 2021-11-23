package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {
    LocalDateTime time = LocalDateTime.of(2021, 01, 01, 10, 03, 2);
    LocalDateTime timeOfLoging = LocalDateTime.of(2021, 01, 02, 10, 03, 2);
    HikingTour hikingTour = new HikingTour();

    @Test
    void logFieldPoints() {
        FieldPoint fp1 = new FieldPoint(time, 47.1, 19.5);
        time.plusMinutes(1);
        FieldPoint fp2 = new FieldPoint(time, 47.2, 19.6);
        time.plusMinutes(1);
        FieldPoint fp3 = new FieldPoint(time, 47.3, 19.7);
        hikingTour.logFieldPoints(timeOfLoging, fp1, fp2, fp3);
        assertEquals(3, hikingTour.getFieldPoints().size());
        assertSame(fp3, hikingTour.getFieldPoints().get(2));
        assertEquals(timeOfLoging, fp1.getTimeOfLogging());
        assertEquals(timeOfLoging, fp3.getTimeOfLogging());
    }

    @Test
    void logFieldPointsNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> hikingTour.logFieldPoints(null));
        assertEquals("A timeOfLogging null!", iae.getMessage());
    }
}