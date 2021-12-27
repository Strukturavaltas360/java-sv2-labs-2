package schoolrecords;

public class StudyResultByName {
    private final String studentName;
    private final double studyAverage;

    public StudyResultByName(String studentName, double studyAverage) {
        new StringValidator("Student name").validate(studentName);
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }
}
