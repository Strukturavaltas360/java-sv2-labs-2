package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public Integer getMax(List<Integer> heights) {
        Integer max = null;
        for (Integer height: heights) {
            if (max == null || height > max) {
                max = height;
            }
        }
        return max;
    }
}
