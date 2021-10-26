package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        boolean neptunIdEquals;
        if (student.getNeptunId() == null)
            neptunIdEquals = student.getNeptunId() == anotherStudent.getNeptunId();
        else
            neptunIdEquals = student.getNeptunId().equals(anotherStudent.getNeptunId());

        boolean oktIdEquals;
        if (student.getOktId() == null)
            oktIdEquals = student.getOktId() == anotherStudent.getOktId();
        else
            oktIdEquals = student.getOktId().equals(anotherStudent.getOktId());

        return neptunIdEquals && oktIdEquals;
    }

    public List<Student> getStudents() {
        return students;
    }
}
