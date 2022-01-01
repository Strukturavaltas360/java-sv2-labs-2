package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                String [] parts = line.split(":");
                int numberOfPersons = Integer.parseInt(parts[1].trim());
                result.add(String.format("%s: %d", parts[0], amount / numberOfPersons));
            }
        } catch (NullPointerException |
                IOException |
                ArrayIndexOutOfBoundsException |
                NumberFormatException |
                ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
        return result;
    }
}
