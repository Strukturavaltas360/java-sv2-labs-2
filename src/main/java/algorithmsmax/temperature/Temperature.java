package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public Integer getMin(List<Integer> temperatures) {
        Integer min = null;
        for (Integer temperature: temperatures) {
            if (min == null || temperature < min) {
                min = temperature;
            }
        }
        return min;
    }
}
