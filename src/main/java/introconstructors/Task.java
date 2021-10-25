package introconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    /* ha a forrásban nincs konstruktor
    akkor generált konstruktort:

    public Task() {
    }

    ha a forrásban volt konstruktor
    akkor a fordító nem generált másikat
     */


    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void start(){
        startDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
