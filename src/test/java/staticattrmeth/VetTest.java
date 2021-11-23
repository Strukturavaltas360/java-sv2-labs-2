package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void addDog() {
        Vet vet = new Vet();
        vet.addDog(new Dog("első", 1, Spiecies.BEAGLE));
        vet.addDog(new Dog("második", 2, Spiecies.BEAGLE));
        vet.addDog(new Dog("harmadik", 3, Spiecies.BEAGLE));
        assertEquals(1, vet.getDogs().get(0).getCode());
        assertEquals(3, vet.getDogs().get(2).getCode());
    }
}