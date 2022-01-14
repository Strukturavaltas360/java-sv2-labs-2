package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {
    private static int nextId = 1;
    private static int getNextId() {
        return nextId++;
    }

    private int registrationNumber;
    private String description;
    private LocalDate registrationDate;

    public LostProperty(String description, LocalDate registrationDate) {
        if (description == null || registrationDate == null || description.isBlank()) {
            throw new IllegalArgumentException("Invalid values!");
        }
        this.description = description;
        this.registrationDate = registrationDate;
        this.registrationNumber = getNextId();
    }

    @Override
    public int compareTo(LostProperty o) {
        if (this.description.equals(o.description)) {
            return this.registrationDate.compareTo(o.registrationDate);
        }
        return this.description.compareTo(o.description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(description, that.description) && Objects.equals(registrationDate, that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, registrationDate);
    }

    @Override
    public String toString() {
        return "LostProperty{" +
                "registrationNumber=" + registrationNumber +
                ", description='" + description + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
}
