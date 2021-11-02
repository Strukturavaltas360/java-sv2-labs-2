package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekTest {
    @Test
    void testDayOfWeekDescription() {
        DayOfWeek dow = new DayOfWeek();
        assertEquals("hét eleje", dow.getDayDescription("hétfŐ"));
        assertEquals("hét közepe", dow.getDayDescription("SZERDA"));
        assertEquals("majdnem hétvége", dow.getDayDescription("péntek"));
        assertEquals("hét vége", dow.getDayDescription("vasÁRNAp"));
        assertEquals("ismeretlen nap", dow.getDayDescription("január"));
    }
}
