package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void containsLongerWordTest() {
        Word word = new Word();
        List<String> words = Arrays.asList("szó", "alma", "körte", "épület");
        assertFalse(word.containsLongerWord(words, "teszik"));
        assertTrue(word.containsLongerWord(words, "igaz"));
    }
}