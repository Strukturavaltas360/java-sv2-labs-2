package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void containsFewerHabitantsTest() {
        Town town = new Town();
        List<Integer> list = Arrays.asList(1200, 2000, 780, 1450);
        assertTrue(town.containsFewerHabitants(list, 781));
        assertFalse(town.containsFewerHabitants(list, 779));
    }
}