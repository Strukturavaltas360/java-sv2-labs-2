package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWithTest() {
        Prefix prefix = new Prefix();
        List<String> words = Arrays.asList("felet", "feltétel", "tartalmaz", "feladat", "tartósít");
        List<String> filtered = prefix.getWordsStartWith(words, "fel");
        assertEquals(3, filtered.size());
        assertTrue(filtered.contains("felet"));
        assertFalse(filtered.contains("tartalmaz"));
    }
}