package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {
    public String getGreeting(int hour, int minute) {
        LocalTime time = LocalTime.of(hour, minute, 0);
        String greeting = "Jó éjt";
        if (time.isAfter(LocalTime.of(5, 0, 0))
                && time.isBefore(LocalTime.of(9, 0, 0))) {
            greeting = "Jó reggelt";
        } else if (time.isAfter(LocalTime.of(8, 59, 59))
                && time.isBefore(LocalTime.of(18, 30, 0))) {
            greeting = "Jó napot";
        } else if (time.isAfter(LocalTime.of(18, 29, 59))
                && time.isBefore(LocalTime.of(20, 0, 0))) {
            greeting = "Jó estét";
        }
        return greeting;
    }
}
