package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    private List<Integer> numbers;

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount > lotteryType) {
            throw new IllegalArgumentException("Ball count greater than lottery numbers!");
        }
        numbers = createList(lotteryType);
        Collections.shuffle(numbers);
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <ballCount; i++) {
            result.add(numbers.get(i));
        }
        Collections.sort(result);
        return result;
    }

    private List<Integer> createList(int lotteryType) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= lotteryType; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
