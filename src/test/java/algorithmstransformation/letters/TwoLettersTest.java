package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLetters() {
        TwoLetters twoLetters = new TwoLetters();
        List<String> words = Arrays.asList("szó", "alma", "körte", "épület");
        assertEquals(words.size(), twoLetters.getFirstTwoLetters(words).size());
        assertEquals("sz", twoLetters.getFirstTwoLetters(words).get(0));
    }
}