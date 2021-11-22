package immutable;

import java.time.LocalDate;

public class Car {
    private final String make;
    private final String model;
    private final int yearOfProduction;

    public Car(String make, String model, int yearOfProduction) {
        if (make == null || make.length() == 0) {
            throw new IllegalStateException("Hiba: a márka üres!");
        }
        if (yearOfProduction > LocalDate.now().getYear()) {
            throw new IllegalStateException("Hiba: a gyártási év jövőbeli!");
        }
        this.make = make;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
