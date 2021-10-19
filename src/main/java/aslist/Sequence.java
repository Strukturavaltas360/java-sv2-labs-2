package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));

        for (int i = 0; i < 5; i++) {
            int newElem = elements.get(elements.size() - 2) * elements.get(elements.size() - 1);
            elements.add(newElem);
        }

        System.out.println("Lista mérete: " + elements.size());
        System.out.println(elements);
    }
}
