package lambdaprimitives;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SportGadgetStoreTest {
    Product product1 = new Product("product1", 110, 10);
    Product product2 = new Product("product2", 20, 12);
    Product product3 = new Product("product3", 310, 3);
    Product product4 = new Product("product4", 140, 24);
    Product product5 = new Product("product5", 50, 5);

    SportGadgetStore store = new SportGadgetStore(List.of(product1, product2, product3, product4, product5));

    @Test
    void getNumberOfProducts() {
        assertEquals(54, store.getNumberOfProducts());
    }

    @Test
    void getAveragePrice() {
        assertEquals((110+20+310+140+50)/5.0, store.getAveragePrice());
        assertEquals(0, new SportGadgetStore(List.of()).getAveragePrice());
    }

    @Test
    void getExpensiveProductStatistics() {
        String expected = "Összesen 2 féle termék, amelyekből minimum 3 db, maximum 24 db, összesen 27 db van.";
        assertEquals(expected, store.getExpensiveProductStatistics(110));
        assertEquals("Nincs ilyen termék.", store.getExpensiveProductStatistics(1000));
    }
}