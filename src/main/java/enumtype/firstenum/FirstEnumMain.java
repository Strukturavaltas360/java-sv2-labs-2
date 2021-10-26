package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        for (Continent continent: Continent.values()) {
            System.out.println(continent.name());
        }
        System.out.println(Arrays.toString(Continent.values()));

        for (int i = 0; i < Ocean.values().length; i++) {
            Ocean ocean = Ocean.values()[i];
            System.out.println(i + ": " + Ocean.valueOf(ocean.name()));
        }

        for (Football foci: Football.values()) {
            System.out.println(foci.name());
        }

    }
}
