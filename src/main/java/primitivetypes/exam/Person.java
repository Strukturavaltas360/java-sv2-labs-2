package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dayOfBirth;
    private int zip;
    private double average;

    public Person(String name, LocalDate dayOfBirth, int zip, double average) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.zip = zip;
        this.average = average;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", dayOfBirth: " + dayOfBirth +
                ", zip: " + zip + ", average: " + average + "}";
    }

    public String getName() {
        return name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public int getZip() {
        return zip;
    }

    public double getAverage() {
        return average;
    }

}
