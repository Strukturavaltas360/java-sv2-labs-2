package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void countChildrenWithHeightGreaterThanTest() {
        List<Integer> ChildrenHeights = Arrays.asList(170, 145, 149, 150, 151, 155);
        Height height = new Height();
        assertEquals(3, height.countChildrenWithHeightGreaterThan(ChildrenHeights, 150));
    }
}