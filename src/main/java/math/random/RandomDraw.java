package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lukács");
        names.add("Ambrus");
        names.add("Nándor");
        names.add("Ferdinánd");
        names.add("Vendel");
        names.add("Orsolya");
        names.add("Klementina");
        names.add("Előd");
        names.add("Korinna");
        names.add("Gyöngyi");

        Random random = new Random();
        int rand1 = random.nextInt(0, 5);
        int rand2 = random.nextInt(5, 10);

        System.out.println(names.get(rand1) + ", " + names.get(rand2));
    }
}
