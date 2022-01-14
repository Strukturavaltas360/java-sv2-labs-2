package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment {
    private String text;
    private LocalDateTime time;

    public Comment(String text, LocalDateTime time) {
        this.text = text;
        this.time = time;
    }

    public Comment(Comment source) {
        this.text = source.text;
        this.time = source.time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(text, comment.text) && Objects.equals(time, comment.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, time);
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
