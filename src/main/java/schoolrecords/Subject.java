package schoolrecords;

public class Subject {
    private String subjectName;

    public Subject(String subjectName) {
        new StringValidator("Subject name").validate(subjectName);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
