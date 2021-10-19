package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();
        foodList.add("Darálthús");
        foodList.add("Spenót");
        foodList.add("Jégkrém");
        foodList.add("Zöldborsó");
        foodList.add("Hal");

        System.out.println("Lista hossza: " + foodList.size());
        System.out.println(foodList.toString());
        foodList.remove(4);
        foodList.remove(1);
        System.out.println(foodList.toString());
    }
}
