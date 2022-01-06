package collectionslist;

import java.time.LocalDate;

public class Food {
    private String name;
    private LocalDate bestBefore;

    public Food(String name, LocalDate bestBefore) {
        this.name = name;
        this.bestBefore = bestBefore;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }
}
