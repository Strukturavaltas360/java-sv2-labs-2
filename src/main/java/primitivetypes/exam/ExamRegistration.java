package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Exam exam = new Exam();
        System.out.println("Kérem a vizsgára jelentkezők adatait (max 5 fő)!");
        Person person = null;
        for (int i = 0; i < 5 && (i == 0 || person != null) ; i++) {
            System.out.println((i + 1) + ". jelentkező:");
            if ((person = scanPerson()) != null) exam.addPerson(person);
        }
        System.out.println(exam.getParticipants());
    }

    static Person scanPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-- Név (üres -> bevitel vége): ");
        String name = scanner.nextLine();
        if (name.length() > 0) {
            System.out.print("-- Születési idő (éééé-hh-nn): ");
            String dayOfBirthString = scanner.nextLine();
            System.out.print("-- Irányítószám: ");
            String zipString = scanner.nextLine();
            System.out.print("-- Jegyek átlaga: ");
            String averageString = scanner.nextLine();
            return buildPerson(name, dayOfBirthString, zipString, averageString);
        } else return null;
    }

    static Person buildPerson(String name, String dayOfBirthString, String zipString, String averageString) {
        LocalDate dayOfBirth = LocalDate.parse(dayOfBirthString);
        int zip = Integer.parseInt(zipString);
        double average = Double.parseDouble(averageString);
        return new Person(name, dayOfBirth, zip, average);
    }
}
