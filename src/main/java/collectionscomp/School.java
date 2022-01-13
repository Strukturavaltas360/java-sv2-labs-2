package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        Student student1 = new Student("studentb", 160);
        Student student2 = new Student("studento", 190);
        Student student3 = new Student("studentó", 180);
        Student student4 = new Student("studentá", 170);
        students.addAll(List.of(student1, student2, student3, student4));
        System.out.println(students);

        Map<String, Integer> map = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        map.put(student1.getName(), student1.getHeight());
        map.put(student2.getName(), student2.getHeight());
        map.put(student3.getName(), student3.getHeight());
        map.put(student4.getName(), student4.getHeight());
        System.out.println(map);
    }
}
