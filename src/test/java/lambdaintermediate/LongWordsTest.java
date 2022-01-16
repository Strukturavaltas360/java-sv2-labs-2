package lambdaintermediate;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class LongWordsTest {
    String word1 = "getNumberOfWordsStartWith";
    String word2 = "testGetNumberOfWordsStartWith";
    String word3 = "getShortestWordContainingGivenCharacter";
    String word4 = "testGetShortestWordContainingGivenCharacter";
    String word5 = "getLongerWords";
    String word6 = "testGetLongerWords";
    LongWords longWords = new LongWords(List.of(word1, word2, word3, word4, word5, word6));

    @Test
    void getNumberOfWordsStartWith() {
        assertEquals(3, longWords.getNumberOfWordsStartWith("test"));
    }

    @Test
    void getLongerWords() {
        assertEquals(List.of(word2, word3, word4), longWords.getLongerWords(25));
    }

    @Test
    void getShortestWordContainingGivenCharacter() {
        assertEquals(word5, longWords.getShortestWordContainingGivenCharacter('W').get());
    }
}