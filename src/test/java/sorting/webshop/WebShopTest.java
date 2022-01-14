package sorting.webshop;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {
    Product p1 = new Product("szalma", 1, LocalDateTime.parse("2022-01-01T12:00"));
    Product p2 = new Product("szalámi", 1000, LocalDateTime.parse("2022-01-03T12:00"));
    Product p3 = new Product("szalonna", 1500, LocalDateTime.parse("2022-01-02T12:00"));
    Product p4 = new Product("sZesz", 800, LocalDateTime.parse("2022-01-04T12:00"));
    WebShop ws = new WebShop(List.of(p1, p2, p3, p4));

    @Test
    void getProductsByName() {
        assertEquals(List.of(p2, p1, p3, p4), ws.getProductsByName());
        assertEquals(List.of(p1, p2, p3, p4), ws.getProducts());
    }

    @Test
    void getProductsByPrice() {
        assertEquals(List.of(p1, p4, p2, p3), ws.getProductsByPrice());
        assertEquals(List.of(p1, p2, p3, p4), ws.getProducts());
    }

    @Test
    void getProductsByFrom() {
        assertEquals(List.of(p1, p3, p2, p4), ws.getProductsByFrom());
        assertEquals(List.of(p1, p2, p3, p4), ws.getProducts());
    }
}