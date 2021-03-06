package schoolrecords;

public class Mark {
    private final MarkType markType;
    private final Subject subject;
    private final Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        new MarkValidator().validate(markType, subject, tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this(MarkType.valueOf(markType), subject, tutor);
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", markType.getDescription(), markType.getMark());
    }

    public String toStringWithSubject() {
        return String.format("%s: %s(%d)", subject.getSubjectName(), markType.getDescription(), markType.getMark());
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
