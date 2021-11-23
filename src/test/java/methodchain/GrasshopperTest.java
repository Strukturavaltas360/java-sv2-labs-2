package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @Test
    void hopOnce() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE);
        assertEquals(3, grasshopper.getPosition());
        grasshopper.hopOnce(Direction.NEGATIVE).hopOnce(Direction.NEGATIVE);
        assertEquals(1, grasshopper.getPosition());
    }

    @Test
    void moveFromZeroToThreeWithFiveHops() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grasshopper.getPosition());
    }
}