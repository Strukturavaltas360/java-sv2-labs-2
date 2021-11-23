package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sum() {
        SeparatedSum separatedSum = new SeparatedSum();
        PlusMinusDouble result = separatedSum.sum("12,8;25,7;-84,9;72,1;-52,8;-15,6");
        assertEquals(12.8 + 25.7 + 72.1, result.getPlus());
        assertEquals(-84.9 - 52.8 - 15.6, result.getMinus());
    }
}