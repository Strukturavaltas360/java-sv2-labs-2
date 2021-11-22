package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    List<Person> persons;

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public List<Student> getStudents() {
        List<Student> result = new ArrayList<>();
        for (Person person: persons) {
            if (person.getAge() <= 16) {
                result.add(new Student(person.getName(), person.getAddress()));
            }
        }
        return result;
    }
}
