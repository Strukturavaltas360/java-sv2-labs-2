package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void getNumberOfVowelsTest() {
        Vowels vowels = new Vowels();
        assertEquals(0, vowels.getNumberOfVowels(null));
        assertEquals(1, vowels.getNumberOfVowels("a"));
        assertEquals(0, vowels.getNumberOfVowels("b"));
        assertEquals(4, vowels.getNumberOfVowels("árvíztűrő"));
    }
}