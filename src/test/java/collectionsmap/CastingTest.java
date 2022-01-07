package collectionsmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {
    Map<Integer, String> applicants = new HashMap<>();

    @BeforeEach
    void init() {
        applicants.put(10, "10-es");
        applicants.put(15, "15-ös");
        applicants.put(77, "77-es");
        applicants.put(105, "105-ös");
        applicants.put(19, "19-es");
        applicants.put(45, "45-ös");
        applicants.put(82, "82-es");
    }

    @Test
    void callNextApplicant() {
        Casting casting = new Casting();
        assertEquals("19-es", casting.callNextApplicant(17, applicants));
        assertEquals("45-ös", casting.callNextApplicant(40, applicants));
        assertEquals(null, casting.callNextApplicant(105, applicants));
    }
}