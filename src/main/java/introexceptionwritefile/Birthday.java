package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Birthday birthday = new Birthday();
        List<String> birthdays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hány személy adatait akarja megadni?: ");
        int numberOfPersons = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfPersons ; i++) {
            String line = birthday.readPersonAndBirthday(scanner, i);
            if (line != null) {
                birthdays.add(line);
            } else {
                i--;
            }

        }

        Path path = Paths.get("src/main/resources/introexceptionwritefile/birthday.csv");
        birthday.writeToFile(path, birthdays);
    }

    private void writeToFile(Path path, List<String> list) {
        try {
            Files.write(path, list);
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }

    }

    private String readPersonAndBirthday(Scanner scanner, int index) {
        System.out.print(String.format("%d. személy neve: ", index));
        String name = scanner.nextLine();
        System.out.print(String.format("%d. személy születésnapja (éééé-hh-nn): ", index));
        String birthdayString = scanner.nextLine();
        try {
            LocalDate birthday = LocalDate.parse(birthdayString);
            return name + ';' + birthday;
        } catch (DateTimeParseException dtpe) {
            System.out.println("Hibás dátumformátum!");
            return null;
        }
    }
}
