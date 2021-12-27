package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        new StringValidator("Student name").validate(name);
        this.name = name;
    }

    public void grading(Mark mark) {
        new NotNullValidator("Mark").validate(mark);
        marks.add(mark);
    }

    public double calculateAverage() {
        return calculateAverageOfMarks(marks);
    }

    public double calculateSubjectAverage(Subject subject) {
        return calculateAverageOfMarks(selectMarksOfSubject(subject));
    }

    private double calculateAverageOfMarks(List<Mark> marks) {
        if (marks.size() > 0) {
            int sum = 0;
            for (Mark mark : marks) {
                sum += mark.getMarkType().getMark();
            }
            return (100 * sum / marks.size()) / 100.0;
        }
        return 0.0;
    }

    private List<Mark> selectMarksOfSubject(Subject subject) {
        List<Mark> selected = new ArrayList<>();
        for (Mark mark: marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                selected.add(mark);
            }
        }
        return selected;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Mark mark: marks) {
            sb.append(" ").append(mark.toStringWithSubject());
        }
        return name + " marks:" + sb.toString();
    }

    public String getName() {
        return name;
    }
}
