package searching;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LostAndFoundOfficeTest {
    LostProperty lp1 = new LostProperty("Sapka", LocalDate.parse("2022-01-03"));
    LostProperty lp2 = new LostProperty("Sapka", LocalDate.parse("2022-01-02"));
    LostProperty lp3 = new LostProperty("Sapka", LocalDate.parse("2022-01-01"));
    LostProperty lp4 = new LostProperty("cipő", LocalDate.parse("2022-01-01"));
    LostProperty lp5 = new LostProperty("kesztyű", LocalDate.parse("2022-01-05"));
    LostProperty lp6 = new LostProperty("kesztyű", LocalDate.parse("2022-01-01"));
    LostAndFoundOffice lfo = new LostAndFoundOffice(List.of(lp1, lp2, lp3, lp4, lp5, lp6));

    @Test
    void findLostPropertyTest() {
        assertEquals(lp3, lfo.findLostProperty("sapka"));
        System.out.println(lfo.getLostProperties());
    }

    @Test
    void findLostPropertyNotFoundTest() {
        assertThrows(IllegalArgumentException.class, () -> lfo.findLostProperty("elem"));
    }
}