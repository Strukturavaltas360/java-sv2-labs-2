package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void nextLine() {
        TypeWriterState tws = TypeWriterState.CAPS_OFF;
        tws = tws.nextLine();
        assertEquals(TypeWriterState.CAPS_ON, tws);
        tws = tws.nextLine();
        assertEquals(TypeWriterState.CAPS_OFF, tws);
    }
}