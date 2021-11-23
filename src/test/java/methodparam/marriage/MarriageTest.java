package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {
    Woman woman = new Woman("Virág Liza");
    Man man = new Man("Kiss Virgil");

    Marriage marriage = new Marriage();

    @Test
    void getMarriedMan() {
        marriage.getMarried(woman, man);
        assertEquals("Kiss Virgil", man.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals("házasságkötés_ideje", man.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(0).getDate());
    }

    @Test
    void getMarriedWoman() {
        marriage.getMarried(woman, man);
        assertEquals("Kissné Virág Liza", woman.getName());
        assertEquals(2, woman.getRegisterDates().size());
        assertEquals("házasságkötés_ideje", woman.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(0).getDate());
        assertEquals("házasságkötés miatti névváltozás", woman.getRegisterDates().get(1).getDescription());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
    }

    @Test
    void getMarriedNull() {
        assertThrows(IllegalArgumentException.class, () -> marriage.getMarried(null, man));
        assertThrows(IllegalArgumentException.class, () -> marriage.getMarried(woman, null));
    }
}