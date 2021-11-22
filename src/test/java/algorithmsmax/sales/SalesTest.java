package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    Sales sales = new Sales();
    Salesperson person1 = new Salesperson("P1", 100_000, 80_000);
    Salesperson person2 = new Salesperson("P2", 100_000, 95_000);
    Salesperson person3 = new Salesperson("P3", 110_000, 110_000);
    Salesperson person4 = new Salesperson("P4", 100_000, 120_000);
    List<Salesperson> salespersons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        salespersons.add(person1);
        salespersons.add(person2);
        salespersons.add(person3);
        salespersons.add(person4);
    }

    @Test
    void selectSalesPersonWithMaxSalesAmount() {
        assertSame(person3, sales.selectSalesPersonWithMaxSalesAmount(salespersons));
    }

    @Test
    void selectSalesPersonWithFurthestAboveTarget() {
        assertSame(person1, sales.selectSalesPersonWithFurthestAboveTarget(salespersons));
    }

    @Test
    void selectSalesPersonWithFurthestBelowTarget() {
        assertSame(person4, sales.selectSalesPersonWithFurthestBelowTarget(salespersons));
    }
}