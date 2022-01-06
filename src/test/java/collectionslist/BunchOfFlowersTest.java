package collectionslist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {
    BunchOfFlowers evenBunch = new BunchOfFlowers(List.of("rózsa1", "rózsa2", "rózsa3", "rózsa4"));
    BunchOfFlowers oddBunch = new BunchOfFlowers(List.of("rózsa1", "rózsa2", "rózsa3", "rózsa4","rózsa5"));

    @Test
    void addFlowerInTheMiddleEvenTest() {
        evenBunch.addFlowerInTheMiddle("tulipán");
        assertEquals(List.of("rózsa1", "rózsa2", "tulipán", "rózsa3", "rózsa4"), evenBunch.getFlowers());
    }

    @Test
    void addFlowerInTheMiddleOddTest() {
        oddBunch.addFlowerInTheMiddle("tulipán");
        assertEquals(List.of("rózsa1", "rózsa2", "tulipán", "rózsa3", "tulipán", "rózsa4", "rózsa5"), oddBunch.getFlowers());
    }
}