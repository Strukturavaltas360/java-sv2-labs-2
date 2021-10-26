package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person1 = new Person("Blanka",
                "blanka@gmail.com",
                "111-222-333",
                "11111111-11111111-00000000",
                "+36 20 123 4567");
        Person person2 = new Person("Dömötör",
                "domotor@gmail.com",
                "222-222-333",
                "21111111-11111111-00000000",
                "+36 30 123 4567");
        Person person3 = new Person("Simon",
                "simon@gmail.com",
                "333-222-333",
                "31111111-11111111-00000000",
                "+36 70 123 4567");

        Student student1 = new Student(person1, "N1", "O1");
        Student student2 = new Student(person2, "N2", "O1");
        Student student3 = new Student(person3, "N1", "O2");
        Student student4 = new Student(person3, "N1", "O2");

        University bme = new University();
        bme.addStudent(student1);
        bme.addStudent(student2);
        bme.addStudent(student3);
        bme.addStudent(student4);

        System.out.println(bme.areEqual(bme.getStudents().get(0), bme.getStudents().get(1)));
        System.out.println(bme.areEqual(bme.getStudents().get(0), bme.getStudents().get(2)));
        System.out.println(bme.areEqual(bme.getStudents().get(2), bme.getStudents().get(3)));
    }
}
