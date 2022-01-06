package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {
    List<Food> foods = new LinkedList<>();

    public void sellFirst(Food food) {
        LocalDate today = LocalDate.now();
        if (food.getBestBefore().equals(today)) {
            foods.add(0, food);
        }
    }

    public void add(Food food) {
        foods.add(food);
    }

    public List<Food> getFoods() {
        return foods;
    }
}
