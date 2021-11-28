package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {
    ClassRoom cr1 = new ClassRoom("cr1", 20, Facility.PROJECTOR);
    ClassRoom cr2 = new ClassRoom("cr2", 10, Facility.COMPUTERS);
    ClassRoom cr3 = new ClassRoom("cr3", 20, Facility.COMPUTERS);
    Course course1 = new Course(15, Facility.COMPUTERS);

    @Test
    void isSuitable() {
        assertFalse(cr1.isSuitable(course1));
        assertFalse(cr2.isSuitable(course1));
        assertTrue(cr3.isSuitable(course1));
    }
}