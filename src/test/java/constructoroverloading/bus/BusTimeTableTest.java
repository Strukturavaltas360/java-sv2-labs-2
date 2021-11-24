package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {
    List<SimpleTime> timeTable = Arrays.asList(
            new SimpleTime(10, 0),
            new SimpleTime(10, 20),
            new SimpleTime(10,40),
            new SimpleTime(11, 0),
            new SimpleTime(11, 20),
            new SimpleTime(11,40));
    BusTimeTable busTimeTable;


    @Test
    void createTest() {
        busTimeTable = new BusTimeTable(timeTable);
        assertSame(timeTable, busTimeTable.getTimeTable());
        busTimeTable = new BusTimeTable(10,11,20);
        assertNotSame(timeTable, busTimeTable.getTimeTable());
        assertEquals(timeTable, busTimeTable.getTimeTable());
    }

    @Test
    void getNextBusTest() {
        busTimeTable = new BusTimeTable(timeTable);
        assertEquals("11:00", busTimeTable.getNextBus(new SimpleTime(10, 45)).toString());
        assertEquals("10:00", busTimeTable.getNextBus(new SimpleTime(0, 0)).toString());
        assertThrows(IllegalStateException.class, () -> busTimeTable.getNextBus(new SimpleTime(11, 40)));
    }

    @Test
    void getNextBusReverseTimeTableTest() {
        List<SimpleTime> timeTableReverse = Arrays.asList(
                new SimpleTime(11, 40),
                new SimpleTime(11, 20),
                new SimpleTime(11,0),
                new SimpleTime(10, 40),
                new SimpleTime(10, 20),
                new SimpleTime(10,0));
        busTimeTable = new BusTimeTable(timeTableReverse);
        assertEquals("11:00", busTimeTable.getNextBus(new SimpleTime(10, 45)).toString());
        assertEquals("10:00", busTimeTable.getNextBus(new SimpleTime(0, 0)).toString());
        assertThrows(IllegalStateException.class, () -> busTimeTable.getNextBus(new SimpleTime(11, 40)));
    }
}