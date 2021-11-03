package controliteration.day;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {
    @Test
    void testDay() {
        Day day = new Day();
        for (int i = 0; i < 24; i++) {
            day.addHour(new Hour(i));
        }
        day.setDayPeriod();

        List<Hour> hours = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            Hour hour = new Hour(i);
            if (i > 6 && i < 22) {
                hour.setPeriod(DayPeriod.DAYTIME);
            } else {
                hour.setPeriod(DayPeriod.NIGHTTIME);
            }
            hours.add(hour);
        }

        assertEquals(hours, day.getHoursOfDay());
        //assertArrayEquals(hours.toArray(new Hour[24]), day.getHoursOfDay().toArray(new Hour[24]));
    }

}