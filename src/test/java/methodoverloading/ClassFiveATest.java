package methodoverloading;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {
    ClassFiveA classFiveA = new ClassFiveA(Arrays.asList("Alfa Béla", "Béta Cili", "Cica Máté", "Dénes Örs", "Epres Mari", "Fix Liza"));


    @Test
    void getTodayReferringStudent1() {
        assertEquals("Cica Máté", classFiveA.getTodayReferringStudent(2));
    }

    @Test
    void getTodayReferringStudent2() {
        assertEquals("Cica Máté", classFiveA.getTodayReferringStudent(Number.TWO));
    }

    @Test
    void getTodayReferringStudent3() {
        assertEquals("Cica Máté", classFiveA.getTodayReferringStudent("two"));
    }

    @Test
    void getTodayReferringStudent3Exception() {
        assertThrows(IllegalArgumentException.class, () -> classFiveA.getTodayReferringStudent("eight"));
    }
}