package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    List<String> validate(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line: lines) {
            String errorMsg = null;
            String[] parts = line.split(",");
            if (parts.length != 3) {
                errorMsg = String.format("Invalid column count (%d)!", parts.length);
            } else if (!validateLineNr(parts[0])) {
                errorMsg = String.format("Invalid line number (%s)!", parts[0]);
            } else if (!validateValue(parts[1])) {
                errorMsg = String.format("Invalid value (%s)!", parts[1]);
            } else if (!validateName(parts[2])) {
                errorMsg = String.format("Invalid name (%s)!", parts[2]);
            }
            if (errorMsg != null) {
                result.add(errorMsg + ": " + line);
            }
        }
        return result;
    }

    private boolean validateName(String part) {
        String[] parts = part.trim().split(" ");
        return parts.length > 1;
    }

    private boolean validateValue(String part) {
        try {
            double value = Double.parseDouble(part.trim());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private boolean validateLineNr(String part) {
        try {
            int value = Integer.parseInt(part.trim());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
