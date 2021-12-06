package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void tableClothTest() {
        TableCloth tc = new TableCloth(1);
        assertEquals(1, tc.getArea());
        assertEquals(4, tc.getPerimeter());
        assertEquals(1.41, tc.getLengthOfDiagonal(), 0.005);
    }

}