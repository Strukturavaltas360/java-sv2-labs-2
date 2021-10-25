package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vezetéknév: ");
        String familyName = scanner.nextLine();
        System.out.print("Keresztnév: ");
        String givenName = scanner.nextLine();
        System.out.print("Születési év: ");
        int yearOfBirth = scanner.nextInt();
        System.out.print("Születési hó: ");
        int monthOfBirth = scanner.nextInt();
        System.out.print("Születési nap: ");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Person person = new Person(concatNames(familyName, givenName),
                buildDate(yearOfBirth, monthOfBirth, dayOfBirth),
                email);
        System.out.println("Regisztációs adatok:");
        System.out.println(person);
    }

    public static String concatNames(String familyName, String givenName) {
        return familyName + " " + givenName;
    }

    public static LocalDate buildDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}
