package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Kántor", 20, "barna");
        Dog dog2 = new Dog("Lessie", 5, "drapp");
        Dog dog3 = new Dog("Bogi", 1, "fekete");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("fehér");
        System.out.println(dogs);

        Dog dog5 = new Dog("Blöki", 10, "sárga");
        System.out.println(dog5);

        dog5 = dogs.get(1);
        System.out.println(dog5);

        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog4.setColour("kék");
        System.out.println(dogs);

        List<Dog> dogs2 = dogs;
        Dog dog7 = dog4;
        dog4.setColour("lila");
        System.out.println(dogs2);

        dog2.setColour("ezüst");
        System.out.println(dogs2);

        dog2 = null;
        System.out.println(dogs2);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2);

        Dog dog9 = dogs.get(1);
        dog9.setColour("fehér");
        System.out.println(dogs2);
    }
}
