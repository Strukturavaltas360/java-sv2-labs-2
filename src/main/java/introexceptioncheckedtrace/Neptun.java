package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        try {
            List<String> lines = neptun.readNames();
            System.out.println(lines);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private List<String> readNames() throws IOException {
        Path path = Paths.get("src/main/java/introexceptioncheckedtrace/neptun.csv");
        return Files.readAllLines(path);
    }
}
