package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ClassRecords {
    private final String className;
    private final Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        new NotNullValidator("Student").validate(student);
        if (students.size() == 0 || findStudentInStudents(student.getName()) < 0) {
            students.add(student);
            return true;
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        new NotNullValidator("Student").validate(student);
        int index = findStudentInStudents(student.getName());
        if (index >= 0) {
            students.remove(index);
            return true;
        }
        return false;
    }

    public double calculateClassAverage() {
        return calculateClassAverage(null);
    }

    public double calculateClassAverageBySubject(Subject subject) {
        return calculateClassAverage(subject);
    }

    private double calculateClassAverage(Subject subject) {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0.0;
        int studentsWithMark = 0;
        for (Student student : students) {
            double avg;
            avg = subject == null ? student.calculateAverage() : student.calculateSubjectAverage(subject);
            if (avg > 0.0) {
                sum += avg;
                studentsWithMark++;
            }
        }
        if (studentsWithMark > 0) {
            return (((int) (sum * 100)) / studentsWithMark) / 100.0;
        }
        throw new ArithmeticException("No marks present, average calculation aborted!");
    }

    public Student findStudentByName(String name) {
        new StringValidator("Student name").validate(name);
        if (students.size() > 0) {
            int index = findStudentInStudents(name);
            if (index >= 0) {
                return students.get(index);
            }
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        throw new IllegalStateException("No students to search!");
    }

    private int findStudentInStudents(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        int index = random.nextInt(students.size());
        return students.get(index);
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student: students) {
            result.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(student.getName());
        }
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }
}
