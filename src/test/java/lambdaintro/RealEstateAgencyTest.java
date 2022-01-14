package lambdaintro;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateAgencyTest {
    Flat flat1 = new Flat("Bp", 100, 200);
    Flat flat2 = new Flat("Bp", 60, 70);
    Flat flat3 = new Flat("Kecskemét", 300, 150);
    RealEstateAgency agency = new RealEstateAgency(List.of(flat1, flat2, flat3));

    @Test
    void findFirstCheaperFlat() {
        assertEquals(flat2, agency.findFirstCheaperFlat(170));
    }

    @Test
    void findFirstGreaterFlat() {
        assertEquals(flat3, agency.findFirstGreaterFlat(100));
    }

    @Test
    void findFirstFlatInSameTown() {
        assertEquals(flat1, agency.findFirstFlatInSameTown("Bp"));
    }
}