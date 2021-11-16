package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void getFirstWordWithA() {
        Words words = new Words();
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit5/words.txt");
        assertEquals("Anna", words.getFirstWordWithA(path));

        path = Paths.get("src/test/resources/introexceptionreadfiletestjunit5/words2.txt");
        assertEquals("A", words.getFirstWordWithA(path));
    }
}