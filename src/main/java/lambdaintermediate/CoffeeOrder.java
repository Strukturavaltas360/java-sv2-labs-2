package lambdaintermediate;

import java.time.LocalDateTime;
import java.util.List;

public class CoffeeOrder {
    private final List<Coffee> coffeeList;
    private final LocalDateTime dateTime;

    public CoffeeOrder(List<Coffee> coffeeList, LocalDateTime dateTime) {
        if (coffeeList == null || coffeeList.isEmpty() || dateTime == null) {
            throw new IllegalArgumentException("Parameters must not be empty/null!");
        }
        this.coffeeList = coffeeList;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "coffeeList=" + coffeeList +
                ", dateTime=" + dateTime +
                '}';
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
