package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean valid = true;

        System.out.print("Kérem a nevet! ");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException exception) {
            System.out.println(String.format("Hiba: %s", exception.getMessage()));
            valid = false;
        }

        System.out.print("Kérem az életkort! ");
        String ageString = scanner.nextLine();
        try {
            validation.validateAge(ageString);
        }
        catch (IllegalArgumentException exception) {
            System.out.println(String.format("Hiba: %s", exception.getMessage()));
            valid = false;
        }

        System.out.println();
        System.out.println(String.format("A megadott név: %s", name));
        System.out.println(String.format("A megadott életkor: %s", ageString));
        System.out.println(valid ? "A regisztráció sikeres!" : "Sikertelen regisztráció!");
    }
}
