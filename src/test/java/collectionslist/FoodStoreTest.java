package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {
    FoodStore foodStore = new FoodStore();

    @BeforeEach
    void init() {
        foodStore.add(new Food("rizs", LocalDate.of(2022, 10, 10)));
        foodStore.add(new Food("tészta", LocalDate.of(2022, 10, 9)));
        foodStore.add(new Food("olaj", LocalDate.of(2022, 10, 8)));
    }

    @Test
    void sellFirst() {
        assertEquals(3, foodStore.getFoods().size());
        foodStore.sellFirst(new Food("tej", LocalDate.now()));
        assertEquals(4, foodStore.getFoods().size());
        assertEquals("tej", foodStore.getFoods().get(0).getName());
    }

    @Test
    void add() {
        assertEquals(3, foodStore.getFoods().size());
        assertEquals("rizs", foodStore.getFoods().get(0).getName());
        foodStore.add(new Food("cukor", LocalDate.of(2022, 2, 1)));
        assertEquals(4, foodStore.getFoods().size());
        assertEquals("cukor", foodStore.getFoods().get(3).getName());
    }
}