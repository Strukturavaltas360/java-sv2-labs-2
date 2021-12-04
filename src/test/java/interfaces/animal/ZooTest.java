package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    List<Animal> animals = new ArrayList<>();
    Zoo zoo;
    {
        animals.add(new Duck());
        animals.add(new Lion());
        animals.add(new Worm());
        zoo = new Zoo(animals);
    }

    @Test
    void getNumberOfAnimals() {
        assertEquals(3, zoo.getNumberOfAnimals());
    }

    @Test
    void getNumberOfAllLegs() {
        assertEquals(6, zoo.getNumberOfAllLegs());
    }
}