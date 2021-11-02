package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMothTest {
    DayInMonth dayInMonth = new DayInMonth();

    @Test
    void testLeapYear() {
        assertEquals(true, dayInMonth.isLeapYear(2004));
        assertEquals(true, dayInMonth.isLeapYear(2000));
        assertEquals(true, dayInMonth.isLeapYear(2020));
        assertEquals(false, dayInMonth.isLeapYear(1900));
        assertEquals(false, dayInMonth.isLeapYear(2021));
    }

    @Test
    void testGetDayInMonth() {
        assertEquals(31, dayInMonth.getDaysInMonth(2021, "JanuÁr"));
        assertEquals(30, dayInMonth.getDaysInMonth(2021, "áprIlis"));
        assertEquals(29, dayInMonth.getDaysInMonth(2020, "február"));
        assertEquals(28, dayInMonth.getDaysInMonth(2021, "február"));
        assertEquals(0, dayInMonth.getDaysInMonth(2021, "ebruár"));
    }
}
