package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {
    @Test
    void createTest() {
        LocalDate date = LocalDate.of(2000, 10, 20);
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> new Monument("", "address", date, "regno"));
        assertEquals("Hiba: üres a név!", exception.getMessage());
        exception = assertThrows(IllegalStateException.class, () -> new Monument("name", "", date, "regno"));
        assertEquals("Hiba: üres a cím!", exception.getMessage());
        exception = assertThrows(IllegalStateException.class, () -> new Monument("name", "address", null, "regno"));
        assertEquals("Hiba: üres nyilvántartásba vételi dátum!", exception.getMessage());
        exception = assertThrows(IllegalStateException.class, () -> new Monument("name", "address", date, null));
        assertEquals("Hiba: üres a nyilvántartásba vételi szám!", exception.getMessage());

        Monument monument = new Monument("név", "cím", date, "reg12");
        assertEquals("név", monument.getName());
        assertEquals("cím", monument.getAddress());
        assertEquals("2000-10-20", monument.getDateOfRegistration().toString());
        assertEquals("reg12", monument.getRegistrationNo());
    }

}