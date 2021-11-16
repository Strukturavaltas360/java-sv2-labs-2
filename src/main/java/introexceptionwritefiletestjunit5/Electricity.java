package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    private List<String> streets = new ArrayList<>();

    public void writeStreets(Path path) {
        try {
            Files.write(path, streets);
        } catch (IOException exception) {
            throw new IllegalStateException("Can not write file!");
        }
    }

    public void addTestStreets() {
        addStreet(LocalDate.now().plusDays(-1), "Rákóczi u.");
        addStreet(LocalDate.now(), "Kossuth u.");
        addStreet(LocalDate.now(), "Fő tér");
        addStreet(LocalDate.now().plusDays(1), "Petőfi u.");
    }

    private void addStreet(LocalDate date, String street) {
        streets.add(String.format("%tF: %s", date, street));
    }

    public List<String> getStreets() {
        return streets;
    }
}
