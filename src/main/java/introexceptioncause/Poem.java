package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/introexceptioncause/poem.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                System.out.print(line.charAt(0));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
