package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {
    @Test
    void testToConsonant() {
        ToConsonant toConsonant = new ToConsonant();
        assertEquals('b', toConsonant.toConsonant('a'));
        assertEquals('F', toConsonant.toConsonant('E'));
        assertEquals('b', toConsonant.toConsonant('b'));
        assertEquals('0', toConsonant.toConsonant('0'));
    }
}
