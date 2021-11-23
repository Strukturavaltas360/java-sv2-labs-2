package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modifyTest() {
        ModifiedWord modifiedWord = new ModifiedWord();
        assertEquals("AxMy", modifiedWord.modify("alma"));
        assertEquals("SxIy", modifiedWord.modify("szilva"));
    }

    @Test
    void modifyExceptionTest() {
        ModifiedWord modifiedWord = new ModifiedWord();
        assertThrows(IllegalArgumentException.class, ()-> modifiedWord.modify(null));
        assertThrows(IllegalArgumentException.class, ()-> modifiedWord.modify("12"));
    }
}