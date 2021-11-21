package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {
    Salesperson salespersonAbove = new Salesperson("Joe", 100_000, 95_000);
    Salesperson salespersonBellow = new Salesperson("Jack", 110_000, 120_000);

    @Test
    void getAboveTarget() {
        assertEquals(5_000, salespersonAbove.getAboveTarget());
        assertEquals(-10_000, salespersonBellow.getAboveTarget());
    }

    @Test
    void getBellowTarget() {
        assertEquals(-5_000, salespersonAbove.getBellowTarget());
        assertEquals(10_000, salespersonBellow.getBellowTarget());
    }
}