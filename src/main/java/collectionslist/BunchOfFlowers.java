package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> flowers = new LinkedList<>();

    public BunchOfFlowers(List<String> flowers) {
        this.flowers.addAll(flowers);
    }

    public void addFlowerInTheMiddle(String flower) {
        int size = flowers.size();
        if (size % 2 == 0) {
            flowers.add(size / 2, flower);
        } else {
            flowers.add(size / 2 + 1, flower);
            flowers.add(size / 2, flower);
        }
    }

    public List<String> getFlowers() {
        return flowers;
    }
}
