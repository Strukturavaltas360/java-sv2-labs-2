package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    public static enum Status {
        NEW, IN_PROGRESS, CLOSED;
    }
    public static enum CopyMode {
        WITH_COMMENTS, WITHOUT_COMMENTS
    }

    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name) {
        this.name = name;
        time = LocalDateTime.now();
        status = Status.NEW;
    }

    public Issue(Issue source, CopyMode copyMode) {
        this.name = source.name;
        this.time = source.time;
        this.status = source.status;
        if (copyMode == CopyMode.WITH_COMMENTS) {
            for (Comment comment: source.comments) {
                comments.add(new Comment(comment));
            }
        }
    }

    public void add(Comment comment) {
        comments.add(comment);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
