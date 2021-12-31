package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test
    void testToString() {
        Course course = new Course("kurzus", new SimpleTime("09:15"));
        assertEquals("09:15: kurzus", course.toString());
    }
}