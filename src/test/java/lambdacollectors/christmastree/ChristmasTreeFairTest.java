package lambdacollectors.christmastree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeFairTest {
    ChristmasTree ct1 = new ChristmasTree(PineTreeType.NORDMANN, 1.80);
    ChristmasTree ct2 = new ChristmasTree(PineTreeType.SILVER, 1.80);
    ChristmasTree ct3 = new ChristmasTree(PineTreeType.NORDMANN, 1.60);
    ChristmasTree ct4 = new ChristmasTree(PineTreeType.SILVER, 1.60);
    ChristmasTree ct5 = new ChristmasTree(PineTreeType.NORDMANN, 1.90);
    ChristmasTree ct6 = new ChristmasTree(PineTreeType.SILVER, 2.00);
    ChristmasTree ct7 = new ChristmasTree(PineTreeType.SILVER, 1.40);

    ChristmasTreeFair fair = new ChristmasTreeFair(List.of(ct1, ct2, ct3, ct4, ct5, ct6, ct7));

    @Test
    void getCountByType() {
        assertEquals(4, fair.getCountByType().get(PineTreeType.SILVER));
        assertEquals(3, fair.getCountByType().get(PineTreeType.NORDMANN));
        assertEquals(null, fair.getCountByType().get(PineTreeType.SPRUCE));
    }

    @Test
    void getMaxHeightByType() {
        assertEquals(2.0, fair.getMaxHeightByType(PineTreeType.SILVER));
        assertEquals(1.9, fair.getMaxHeightByType(PineTreeType.NORDMANN));
        assertEquals(0, fair.getMaxHeightByType(PineTreeType.SPRUCE));
    }

    @Test
    void getMaxHeightByTypeEmptyTest() {
        assertEquals(0, new ChristmasTreeFair(List.of()).getMaxHeightByType(PineTreeType.SILVER));
    }

    @Test
    void getAveragePrice() {
        assertEquals(15350, fair.getAveragePrice(), 10);
    }

    @Test
    void getAveragePriceEmptyTest() {
        assertEquals(0, new ChristmasTreeFair(List.of()).getAveragePrice());
    }
}