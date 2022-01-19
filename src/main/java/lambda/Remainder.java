package lambda;

import java.util.ArrayList;
import java.util.List;

public class Remainder {
    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        ArrayList<Integer> result = new ArrayList<>(numbers);
        result.replaceAll(integer -> integer % 3);
        return result;
    }
}
