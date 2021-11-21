package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school = new School();

    @Test
    void getNumberOfStudentsNullTest() {
        List<Integer> headCounts = null;
        assertEquals(0, school.getNumberOfStudents(headCounts));
    }

    @Test
    void getNumberOfStudentsEmptyTest() {
        List<Integer> headCounts = new ArrayList<>();
        assertEquals(0, school.getNumberOfStudents(headCounts));
    }

    @Test
    void getNumberOfStudentsTest() {
        List<Integer> headCounts = Arrays.asList(11, 12 ,13);
        assertEquals(11 + 12 + 13, school.getNumberOfStudents(headCounts));
    }
}