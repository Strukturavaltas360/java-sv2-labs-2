package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/introexceptionfinally/names2.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            String firstDr = null;
            for (int i = 0; i < lines.size() && firstDr == null; i++) {
                if (lines.get(i).startsWith("dr")) {
                    firstDr = lines.get(i);
                }
            }
            System.out.println(firstDr != null ? firstDr : "");
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        } finally {
            System.out.println("End of reading.");
        }
    }
}
