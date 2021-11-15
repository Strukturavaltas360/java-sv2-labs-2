package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/introexceptionreadfile/shoppinglist.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                System.out.println(line);
            }
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
