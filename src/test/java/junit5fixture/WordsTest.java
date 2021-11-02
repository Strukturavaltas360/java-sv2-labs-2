package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    private Words words;

    @BeforeEach
    void beforeEach() {
        String[] allWords = {"abált", "abbé", "acél", "agát", "aggat", "ajak", "abban", "abcúg", "adott"};

        words = new Words();
        for (String word: allWords) {
            words.addWord(word);
        }
    }

    @Test
    void testGetWordsStartWith() {
        words.getWordsStartWith("ab");
        String[] shouldRemain = {"abált", "abbé", "abban", "abcúg"};
        assertEquals(new ArrayList<String>(Arrays.asList(shouldRemain)), words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        words.getWordsWithLength(4);
        String[] shouldRemain = {"abbé", "acél", "agát", "ajak"};
        assertEquals(new ArrayList<String>(Arrays.asList(shouldRemain)), words.getWords());
    }
}
