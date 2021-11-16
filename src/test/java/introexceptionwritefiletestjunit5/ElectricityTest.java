package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File tempDir;

    @Test
    void writeStreets() throws IOException {
        Electricity electricity = new Electricity();
        electricity.addTestStreets();
        System.out.println(electricity.getStreets());

        Path path = tempDir.toPath().resolve("streets.txt");
        electricity.writeStreets(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(electricity.getStreets(), lines);
    }
}