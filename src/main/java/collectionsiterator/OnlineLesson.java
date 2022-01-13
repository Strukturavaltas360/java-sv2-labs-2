package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {
    private String teacher;
    private String title;
    private LocalDateTime startTime;

    public OnlineLesson(String teacher, String title, LocalDateTime startTime) {
        this.teacher = teacher;
        this.title = title;
        this.startTime = startTime;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
