package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public void addIngredients(Path path) {
        for (String line : readLinesFromFile(path)) {
            Scanner scanner = new Scanner(line);
            String quantity = null;
            String quantityUnit = null;
            String ingredient = null;
            if (scanner.hasNext()) {
                quantity = scanner.next();
            }
            if (scanner.hasNext()) {
                quantityUnit = scanner.next();
            }
            if (scanner.hasNext()) {
                ingredient = scanner.next();
            }
            if (ingredient != null) ingredients.add(ingredient);
        }
    }

    private List<String> readLinesFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
