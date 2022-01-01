package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {
    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void getHiddenWordTest() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(
                Paths.get("src/test/resources/exceptionresource/hiddenword/hiddenword.txt")));
    }

    @Test
    void getHiddenWordInvalidFileTest() {
        assertThrows(IllegalStateException.class, () -> hiddenWord.getHiddenWord(Paths.get("h.w")));
    }
}