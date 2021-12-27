package schoolrecords;

public class MarkValidator {
    public void validate(MarkType markType, Subject subject, Tutor tutor) {
        new NotNullValidator("Mark type").validate(markType);
        try {
            new NotNullValidator("Subject").validate(subject);
            new NotNullValidator("Tutor").validate(tutor);
        } catch (NullPointerException npe) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }
}
