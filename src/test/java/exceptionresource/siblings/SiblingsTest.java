package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {
    Siblings siblings = new Siblings();

    @Test
    void getFullNamesTest() {
        List<String> actual = siblings.getFullNames("Szabó",
                Paths.get("src/test/resources/exceptionresource/siblings/siblings.txt"));
        assertEquals(Arrays.asList("Szabó Emese", "Szabó Ferenc"), actual);
    }

    @Test
    void getFullNamesInvalidFileTest() {
        assertThrows(IllegalStateException.class, () -> siblings.getFullNames("Szabó",
                Paths.get("s.txt")));
    }
}