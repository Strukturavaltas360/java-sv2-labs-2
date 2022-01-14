package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    static final int TEST_RUN_COUNT = 180;
    int lotteryType = 90;
    int ballCount = 5;
    Lottery lottery = new Lottery();
    Map<Integer, Integer> drawnNumbers;

    @BeforeEach
    void init() {
        drawnNumbers = new TreeMap<>();
        for (int i = 0; i < TEST_RUN_COUNT; i++) {
            for(int number: lottery.selectWinningNumbers(lotteryType, ballCount)) {
                Integer count = drawnNumbers.get(number);
                drawnNumbers.put(number, count != null ? count + 1 : 1);
            }
        }
    }

    @Test
    void numberCountTest() {
        int count = 0;
        for(Map.Entry<Integer, Integer> entry: drawnNumbers.entrySet()) {
            count += entry.getValue();
        }
        assertEquals(TEST_RUN_COUNT * ballCount, count);
    }

    @Test
    void intervallTest() {
        int min = Collections.min(drawnNumbers.keySet());
        int max = Collections.max(drawnNumbers.keySet());
        assertEquals(1, min);
        assertEquals(lotteryType, max);
    }

    @Test
    void spreadTest() {
        int min = Collections.min(drawnNumbers.entrySet()
                .stream()
                .map(entry ->entry.getValue())
                .collect(Collectors.toList()));
        int max = Collections.max(drawnNumbers.entrySet()
                .stream()
                .map(entry ->entry.getValue())
                .collect(Collectors.toList()));
        int averageCountExpected = TEST_RUN_COUNT * ballCount / lotteryType;
        assertTrue(averageCountExpected / 3 < min);
        assertTrue(averageCountExpected * 3 >  max);
    }
}