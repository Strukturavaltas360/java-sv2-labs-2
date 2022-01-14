package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    @Test
    void getNamesOfSucceededPeople() {
        Exam exam = new Exam(List.of(
                new ExamResult("name1", 50),
                new ExamResult("name2", 55),
                new ExamResult("name3", 45),
                new ExamResult("name4", 58),
                new ExamResult("name5", 44),
                new ExamResult("name6", 30),
                new ExamResult("name7", 60)
        ));
        assertEquals(7, exam.getNamesOfSucceededPeople(10).size());
        assertEquals(List.of("name7", "name4", "name2"), exam.getNamesOfSucceededPeople(3));
    }
}