package sorting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarDealerTest {
    Car car1 = new Car("car1", 2000, 200);
    Car car2 = new Car("car2", 2001, 210);
    Car car3 = new Car("car3", 2003, 100);
    Car car4 = new Car("car4", 2002, 205);
    CarDealer carDealer = new CarDealer(List.of(car1, car2, car3, car4));

    @Test
    void getCarsByConstruction() {
        assertEquals(List.of(car1, car2, car4, car3), carDealer.getCarsByConstruction());
        assertEquals(List.of(car1, car2, car3, car4), carDealer.getCars());
    }

    @Test
    void getCarsByPrice() {
        assertEquals(List.of(car3, car1, car4, car2), carDealer.getCarsByPrice());
        assertEquals(List.of(car1, car2, car3, car4), carDealer.getCars());
    }
}