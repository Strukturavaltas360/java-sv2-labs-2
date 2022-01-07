package collectionsset;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Genovéva", 165),
                new Student("Benjámin", 181),
                new Student("Titusz", 190),
                new Student("Leona", 168),
                new Student("Simon", 160),
                new Student("Boldizsár", 171)
        );
        System.out.println(new PhysicalEducation().getOrderInLessons(students));
    }

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> result = new TreeSet<>();
        for (Student student: students) {
            result.add(student.getHeight());
        }
        return result;
    }
}
