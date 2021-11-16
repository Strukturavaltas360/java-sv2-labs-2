package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path) {
        for (String line : readLinesFromFile(path)) {
            if (line.startsWith("A")) return line;
        }
        return "A";
    }

    private List<String> readLinesFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cant read file!", ioe);
        }
    }
}
