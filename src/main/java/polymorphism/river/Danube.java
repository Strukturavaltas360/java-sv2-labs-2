package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River {
    public static void main(String[] args) {
        Danube d = new Danube("Duna", 2850, List.of("Bécs", "Pozsony", "Budapest", "Belgrád"));
        River r = new Danube("Duna", 2850, List.of("Bécs", "Pozsony", "Budapest", "Belgrád"));
        Water w = new Danube("Duna", 2850, List.of("Bécs", "Pozsony", "Budapest", "Belgrád"));
        System.out.println("Danube.getCapitals(): " + d.getCapitals());
        System.out.println("Danube.getName(): " + d.getName());
        System.out.println("Danube.getLength(): " + d.getLength());

        System.out.println("River.getName(): " + r.getName());
        System.out.println("River.getLength: " + r.getLength());
    }

    List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }
}
