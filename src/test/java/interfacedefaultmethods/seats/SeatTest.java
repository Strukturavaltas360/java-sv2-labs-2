package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void getNumberOfSeats() {
        assertEquals(5, new FamilyCar().getNumberOfSeats());
        assertEquals(2, new SportsCar().getNumberOfSeats());
        assertEquals(3, new Car("IFA", 3).getNumberOfSeats());
    }
}