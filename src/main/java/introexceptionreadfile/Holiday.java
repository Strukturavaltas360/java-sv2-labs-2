package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/java/introexceptionreadfile/Holiday.txt"));
            for (String line: lines) {
                System.out.println(line);
            }
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
