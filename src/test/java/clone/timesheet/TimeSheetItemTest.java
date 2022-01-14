package clone.timesheet;

import methodoverloading.Time;
import org.junit.jupiter.api.Test;
import stringconcat.employee.Employee;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeSheetItemTest {
    TimeSheetItem tsi = new TimeSheetItem(
            "empl1",
            "projekt1",
            LocalDateTime.of(2022,1,1,10,0),
            LocalDateTime.of(2022,12,1,10,0));

    @Test
    void copyTest() {
        TimeSheetItem copy = new TimeSheetItem(tsi);
        assertNotSame(tsi, copy);
        assertEquals(tsi.getEmployee(), copy.getEmployee());
        assertEquals(tsi.getProject(), copy.getProject());
        assertEquals(tsi.getFrom(), copy.getFrom());
        assertEquals(tsi.getTo(), copy.getTo());
    }

    @Test
    void copyWithDifferentEmployee() {
        TimeSheetItem copy = tsi.copyWithDifferentEmployee(tsi, "empl2");
        assertNotSame(tsi, copy);
        assertEquals("empl2", copy.getEmployee());
        assertEquals(tsi.getProject(), copy.getProject());
        assertEquals(tsi.getFrom(), copy.getFrom());
        assertEquals(tsi.getTo(), copy.getTo());
    }
}