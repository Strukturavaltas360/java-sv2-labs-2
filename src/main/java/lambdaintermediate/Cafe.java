package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {
    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        if (orders == null) {
            throw new IllegalArgumentException("Orders must not be null!");
        }
        this.orders = new ArrayList<>(orders);
    }

    public Integer getTotalIncome() {
        return orders.stream()
                .flatMap(coffeeOrder -> coffeeOrder.getCoffeeList().stream())
                .reduce(0, (aLong, coffee) -> aLong + coffee.getPrice(), (aLong, aLong2) -> aLong + aLong2);
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders.stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().equals(date))
                .flatMap(coffeeOrder -> coffeeOrder.getCoffeeList().stream())
                .reduce(0, (aLong, coffee) -> aLong + coffee.getPrice(), (aLong, aLong2) -> aLong + aLong2);
    }

    public long getNumberOfCoffee(Coffee.CoffeeType type) {
        return orders.stream()
                .flatMap(coffeeOrder -> coffeeOrder.getCoffeeList().stream())
                .filter(coffee -> coffee.getType() == type)
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return orders.stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().isAfter(from))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .collect(Collectors.toList());
    }

    public void add(CoffeeOrder order) {
        orders.add(order);
    }

    public List<CoffeeOrder> getOrders() {
        return orders;
    }
}
