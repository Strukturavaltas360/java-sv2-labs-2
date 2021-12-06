package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void canDelete() {
        Deletable deletable = OrderState.NEW;
        assertTrue(deletable.canDelete());
        deletable = OrderState.ONBOARD;
        assertFalse(deletable.canDelete());
    }
}