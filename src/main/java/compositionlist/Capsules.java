package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();

    public void addLast(String color) {
        colors.add(color);
    }

    public void addFirst(String color) {
        colors.add(0, color);
    }

    public void removeLast() {
        if (colors.size() > 0) colors.remove(colors.size() - 1);
    }

    public void removeFirst() {
        if (colors.size() > 0) colors.remove(0);
    }

    public List<String> getColors() {
        return colors;
    }
}
