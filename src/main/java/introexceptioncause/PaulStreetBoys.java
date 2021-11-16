package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class PaulStreetBoys {
    public static void main(String[] args) {
        PaulStreetBoys psb = new PaulStreetBoys();
        List<String> lines = psb.readLines();
        psb.writeLines(lines);
    }

    private List<String> readLines() {
        Path path = Paths.get("src/main/java/introexceptioncause/palutcaifiuk.txt");
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    private void writeLines(List<String> lines) {
        for (String line : lines) {
            if (line.equals("Nemecsek Ernő")) {
                line = line.toLowerCase(Locale.ROOT);
            }
            System.out.println(line);
        }
    }
}
