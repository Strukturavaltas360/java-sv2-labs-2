package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            List<String> coaches = operations.readFile();
            System.out.println(operations.getDailySchedule(coaches));
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    List<String> readFile() throws IOException {
        Path path = Paths.get("src/main/java/introexceptioncheckedtrace/underground.txt");
        return Files.readAllLines(path);
    }

    String getDailySchedule(List<String> coaches) {
        StringBuilder sb = new StringBuilder();
        sb.append(LocalDate.now()).append(", ");
        for (String coach : coaches) {
            if (coach.startsWith("2")) {
                sb.append(coach).append(" ");
            }
        }
        return sb.toString();
    }
}
