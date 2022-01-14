package lambdaintro;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsedCarsTest {
    Car car1 = new Car("lada", "1200", 500, 3.5);
    Car car2 = new Car("lada", "NIVA", 750, 3.7);
    Car car3 = new Car("lada", "1500", 600, 3.6);
    Car car4 = new Car("lada", "samara", 700, 3.8);
    Car car5 = new Car("ford", "fiesta", 800, 4.1);
    Car car6 = new Car("skoda", "octavia", 1000, 4.4);
    Car car7 = new Car("vw", "polo", 900, 3.9);
    UsedCars usedCars = new UsedCars(List.of(car1, car2, car3, car4, car5, car6, car7));

    @Test
    void listCarsByPrice() {
        assertEquals(List.of(car1, car3, car4, car2,car5, car7, car6), usedCars.listCarsByPrice());
    }

    @Test
    void listCarsByLengthDesc() {
        assertEquals(List.of(car6, car5, car7, car4, car2, car3, car1), usedCars.listCarsByLengthDesc());
    }

    @Test
    void listCarsOneBrandByType() {
        assertEquals(List.of(car1, car3, car2, car4), usedCars.listCarsOneBrandByType("lada"));
    }
}