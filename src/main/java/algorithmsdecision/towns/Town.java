package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> list, int populationLimit) {
        boolean contains = false;
        for (int i = 0; !contains && i < list.size(); i++) {
            contains = list.get(i) < populationLimit;
        }
        return contains;
    }
}
