package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats = new ExamStats(60);

    @Test
    void getNumberOfTopGrades() {
        int topGrades1 = examStats.getNumberOfTopGrades(81,
                23, 24, 35, 47, 48, 49, 55);
        int topGrades2 = examStats.getNumberOfTopGrades(82,
                23, 24, 35, 47, 48, 49, 55);
        assertEquals(2, topGrades1);
        assertEquals(1, topGrades2);
    }

    @Test
    void hasAnyFailed() {
        assertTrue(examStats.hasAnyFailed(40,
                23, 24, 35, 47, 48, 49, 55));
        assertFalse(examStats.hasAnyFailed(39,
                23, 24, 35, 47, 48, 49, 55));
    }
}