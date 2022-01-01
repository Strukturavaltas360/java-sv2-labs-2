package exceptionmulticatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {
    BinaryStringConverter bsc = new BinaryStringConverter();
    AnswerStat answerStat = new AnswerStat(bsc);

    @Test
    void convertTest() {
        boolean[] actual = answerStat.convert("0110");
        assertEquals(4, actual.length);
        assertTrue(actual[1]);
        assertFalse(actual[3]);
    }

    @Test
    void convertNullTest() {
        InvalidBinaryStringException ibse = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.convert(null));
        assertEquals("Invalid data!", ibse.getMessage());
        assertEquals(NullPointerException.class, ibse.getCause().getClass());
    }

    @Test
    void convertInvalidTest() {
        InvalidBinaryStringException ibse = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.convert("012"));
        assertEquals("Invalid data!", ibse.getMessage());
        assertEquals(IllegalArgumentException.class, ibse.getCause().getClass());
    }

    @Test
    void answerTruePercentTest() {
        assertEquals(100, answerStat.answerTruePercent("1111"));
        assertEquals(0, answerStat.answerTruePercent("0000"));
        assertEquals(50, answerStat.answerTruePercent("0110"));
        assertEquals(33, answerStat.answerTruePercent("011000"));
    }
}