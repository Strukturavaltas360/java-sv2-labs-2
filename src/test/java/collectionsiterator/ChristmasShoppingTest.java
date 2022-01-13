package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {
    ChristmasShopping cs = new ChristmasShopping(List.of(
            new ChristmasPresent("pr1", "Joe", 10000),
            new ChristmasPresent("pr2", "Joe", 5000),
            new ChristmasPresent("pr3", "Jack", 3000),
            new ChristmasPresent("pr4", "Jack", 6000)
    ));

    @Test
    void removeTooExpensivePresent1Test() {
        cs.removeTooExpensivePresent(10000);
        assertEquals(4, cs.getPresents().size());

        cs.removeTooExpensivePresent(7000);
        assertEquals(3, cs.getPresents().size());
    }

    @Test
    void removeTooExpensivePresent2Test() {
        cs.removeTooExpensivePresent(2000);
        assertEquals(0, cs.getPresents().size());
    }
}