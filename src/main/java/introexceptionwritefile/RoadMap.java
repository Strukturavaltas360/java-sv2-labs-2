package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> settlements = Arrays.asList(new String[] {
                "Kecskemét",
                "Kiskunfélegyháza",
                "Kistelek",
                "Balástya"});
        Path path = Paths.get("roadmap.txt");
        try {
            Files.write(path, settlements);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
