package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void getAnimalsWithNumberOfLegsGiven() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("zebra", 4));
        animals.add(new Animal("vaddisznó", 4));
        animals.add(new Animal("zsiráf", 4));
        animals.add(new Animal("páva", 2));
        animals.add(new Animal("kacsa", 2));
        animals.add(new Animal("kobra", 0));
        Zoo zoo = new Zoo(animals);

    }
}