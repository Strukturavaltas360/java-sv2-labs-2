package sorting;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String tajNumber;
    private LocalDateTime reservationDate;

    public Patient(String name, String tajNumber, LocalDateTime reservationDate) {
        this.name = name;
        this.tajNumber = tajNumber;
        this.reservationDate = reservationDate;
    }

    public String getName() {
        return name;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }
}
