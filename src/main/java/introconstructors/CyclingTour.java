package introconstructors;

import java.time.LocalDate;
import java.util.concurrent.Callable;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public static void main(String[] args) {
        CyclingTour tour = new CyclingTour("Tisza tó kerülés", LocalDate.of(2021, 12, 31));
        System.out.println("description: " + tour.getDescription());
        System.out.println("startTime: " + tour.getStartTime());
        System.out.println("numberOfPeople: " + tour.getNumberOfPeople());
        System.out.println("kms: " + tour.getKms());

        tour.registerPerson(11);
        tour.ride(60);
        System.out.println("description: " + tour.getDescription());
        System.out.println("startTime: " + tour.getStartTime());
        System.out.println("numberOfPeople: " + tour.getNumberOfPeople());
        System.out.println("kms: " + tour.getKms());
    }

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride(double km) {
        kms += km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }
}
