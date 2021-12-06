package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void getLongWord() {
        LongWord lw = new LongWord(Paths.get("src/test/resources/interfacedefaultmethods/longword.txt"));
        assertEquals("LONGWORD", lw.getLongWord());
    }
}