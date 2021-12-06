package interfacestaticmethods.schoolcild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void of() {
        assertThrows(IllegalArgumentException.class, ()-> PrimarySchoolChild.of(5).getClass());
        assertEquals(LowerClassSchoolChild.class, PrimarySchoolChild.of(6).getClass());
        assertEquals(LowerClassSchoolChild.class, PrimarySchoolChild.of(10).getClass());
        assertEquals(UpperClassSchoolChild.class, PrimarySchoolChild.of(11).getClass());
        assertEquals(UpperClassSchoolChild.class, PrimarySchoolChild.of(14).getClass());
        assertThrows(IllegalArgumentException.class, ()-> PrimarySchoolChild.of(15).getClass());
    }
}