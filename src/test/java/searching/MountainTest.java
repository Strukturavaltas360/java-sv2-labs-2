package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void searchPike() {
        Mountain mountain = new Mountain(new int[] {500, 535, 621, 701, 832});
        assertTrue(mountain.searchPike(new Pike("pike", 535)));
        assertFalse(mountain.searchPike(new Pike("pike", 635)));
    }
}