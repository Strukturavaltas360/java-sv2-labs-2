package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> inpayments = new HashMap<>();

    public void loadInpayments(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                addEntry(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }

    private void addEntry(String line) {
        String[] parts = line.split(":");
        int payment = Integer.parseInt(parts[1].trim());
        inpayments.put(parts[0], payment);
    }

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }
}
