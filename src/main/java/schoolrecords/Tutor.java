package schoolrecords;

import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        new StringValidator("Tutor name").validate(name);
        new NotNullValidator("Taught subjects list").validate(taughtSubjects);
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject actual: taughtSubjects) {
            if (actual.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
