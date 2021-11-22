package methodstructure.pendrives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PendrivesTest {
    Pendrive pendrive1 = new Pendrive("Generic", 4, 1500);
    Pendrive pendrive2 = new Pendrive("Generic", 8, 2999);
    Pendrive pendrive3 = new Pendrive("Kingston", 8, 3500);

    List<Pendrive> pendrivesList = new ArrayList<>();
    Pendrives pendrives = new Pendrives();

    @BeforeEach
    void init() {
        pendrivesList.add(pendrive1);
        pendrivesList.add(pendrive2);
        pendrivesList.add(pendrive3);
    }

    @Test
    void getBest() {
        assertEquals(pendrive2, pendrives.getBest(pendrivesList));
    }

    @Test
    void getCheapest() {
        assertEquals(pendrive1, pendrives.getCheapest(pendrivesList));
    }

    @Test
    void risePriceWhereCapacity() {
        pendrives.risePriceWhereCapacity(pendrivesList, 5, 8);
        assertEquals(3148, pendrive2.getPrice());
        assertEquals(3675, pendrive3.getPrice());
    }
}