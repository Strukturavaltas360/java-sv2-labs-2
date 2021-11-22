package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> found = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal.getNumberOfLegs() == numberOfLegs) {
                found.add(animal);
            }
        }
        return found;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
