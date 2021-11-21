package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void getMax() {
        Hill hill = new Hill();
        List<Integer> heights = Arrays.asList(981, 759, 991, 670, 1014, 578);
        assertEquals(1014, hill.getMax(heights));
    }
}