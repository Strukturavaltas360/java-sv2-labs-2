package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "Lukács Andor",
                "Tóth Ferdinánd",
                "Kis Vendel",
                "Kovács Orsolya",
                "Mészáros Előd",
                "Ág Gyöngyi");
        printStudyGroups(students);
    }

    static void printStudyGroups(List<String> students) {
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();

        for (String student: students) {
            if (student.length() > 10)
                group1.add(student);
            else
                group2.add(student);
        }

        System.out.println("1. csoport: " + group1);
        System.out.println("2. csoport: " + group2);
    }
}
