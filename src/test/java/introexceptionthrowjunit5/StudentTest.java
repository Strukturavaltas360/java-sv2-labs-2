package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void addNoteHappyPath() {
        Student student = new Student();
        student.addNote(1);
        student.addNote(3);
        student.addNote(5);

        assertEquals(3, student.getNotes().size());
    }

    @Test
    void addNoteException() {
        Student student = new Student();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> student.addNote(0));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }

}