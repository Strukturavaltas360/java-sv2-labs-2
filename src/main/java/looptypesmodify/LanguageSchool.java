package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Student> students2Remove = new ArrayList<>();

        students.add(new Student("Lukács Andor"));
        students.add(new Student("Tóth Ferdinánd"));
        students.add(new Student("Kovács Orsolya"));
        students.add(new Student("Ág Gyöngyi"));

        students.get(0).setActive(false);
        students.get(1).setActive(false);

        /*
        for (int i = students.size() - 1; i >= 0; i--) {
            if (!students.get(i).isActive()) students.remove(i);
        }
         */

        for (Student student: students) {
            if (!student.isActive()) students2Remove.add(student);
        }
        students.removeAll(students2Remove);

        System.out.println(students);
    }
}
