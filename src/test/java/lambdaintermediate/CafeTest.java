package lambdaintermediate;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {
    LocalDateTime yesterdayMorning = LocalDateTime.of(2022, 01, 03, 8, 30);
    LocalDateTime yesterdayNoon = LocalDateTime.of(2022, 01, 03, 12, 00);
    LocalDateTime yesterdayAfternoon = LocalDateTime.of(2022, 01, 03, 16, 00);
    LocalDateTime todayMorning = LocalDateTime.of(2022, 01, 04, 8, 30);

    Coffee espresso = new Coffee(Coffee.CoffeeType.ESPRESSO, 500);
    Coffee latte = new Coffee(Coffee.CoffeeType.LATTE, 700);

    CoffeeOrder order1 = new CoffeeOrder(List.of(espresso), yesterdayMorning);
    CoffeeOrder order1a = new CoffeeOrder(List.of(espresso), yesterdayMorning.plusMinutes(1));
    CoffeeOrder order2 = new CoffeeOrder(List.of(latte), yesterdayMorning.plusMinutes(2));
    CoffeeOrder order3 = new CoffeeOrder(List.of(espresso), yesterdayNoon);
    CoffeeOrder order3a = new CoffeeOrder(List.of(latte), yesterdayNoon.plusMinutes(1));
    CoffeeOrder order4 = new CoffeeOrder(List.of(latte), yesterdayAfternoon);
    CoffeeOrder order4a = new CoffeeOrder(List.of(latte), yesterdayAfternoon.plusMinutes(1));
    CoffeeOrder order5 = new CoffeeOrder(List.of(espresso, espresso, latte, latte), todayMorning);

    Cafe cafe = new Cafe(List.of(order1, order5, order3, order4, order2, order1a, order3a, order4a));

    @Test
    void getTotalIncome() {
        assertEquals(6700, cafe.getTotalIncome());
    }

    @Test
    void getTotalIncomePerDate() {
        assertEquals(2400, cafe.getTotalIncome(todayMorning.toLocalDate()));
    }

    @Test
    void getNumberOfCoffee() {
        assertEquals(5, cafe.getNumberOfCoffee(Coffee.CoffeeType.ESPRESSO));
    }

    @Test
    void getOrdersAfter() {
        assertEquals(List.of(order5, order4, order4a), cafe.getOrdersAfter(yesterdayAfternoon.minusMinutes(1)));
    }

    @Test
    void getFirstFiveOrder() {
        assertEquals(List.of(order1, order1a, order2, order3, order3a), cafe.getFirstFiveOrder(yesterdayMorning.toLocalDate()));
    }

    @Test
    void add() {
        assertEquals(8, cafe.getOrders().size());
        cafe.add(order1);
        assertEquals(9, cafe.getOrders().size());
        assertEquals(order1, cafe.getOrders().get(8));
    }

}