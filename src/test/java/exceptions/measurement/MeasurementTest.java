package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    Measurement measurement = new Measurement();

    @Test
    void readFromFileTest() {
        List<String> lines = measurement.readFromFile(Paths.get("src/main/resources/exceptions/measurement/measurementdata.csv"));
        assertEquals(11, lines.size());
    }

    @Test
    void validateTest() {
        List<String> lines = measurement.readFromFile(Paths.get("src/main/resources/exceptions/measurement/measurementdata.csv"));
        List<String> failedLines = measurement.validate(lines);
        assertEquals(8, failedLines.size());
        assertEquals("Invalid column count (4)!: 2,12.4,John Doe,a",failedLines.get(0));
        assertEquals("Invalid line number (a)!: a,12.4,John Doe",failedLines.get(1));
        assertEquals("Invalid value (12a.4)!: 3,12a.4,John Doe",failedLines.get(2));
        assertEquals("Invalid name (JohnDoe)!: 4,12.4,JohnDoe",failedLines.get(3));
    }
}