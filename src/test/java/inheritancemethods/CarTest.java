package inheritancemethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car(4.5, 20, 45);

    @Test
    void modifyFuelAmount() {
        car.modifyFuelAmount(45);
        assertEquals(45, car.getFuel());
        assertThrows(IllegalArgumentException.class, ()-> car.modifyFuelAmount(46));
        assertThrows(IllegalArgumentException.class, ()-> car.modifyFuelAmount(-1));
    }

    @Test
    void drive() {
        car.drive(400);
        assertEquals(2, car.getFuel());
        assertThrows(IllegalArgumentException.class, ()-> car.drive(50));
    }

    @Test
    void calcFuelConsumption() {
        assertEquals(9, car.calcFuelConsumption(200));
    }
}