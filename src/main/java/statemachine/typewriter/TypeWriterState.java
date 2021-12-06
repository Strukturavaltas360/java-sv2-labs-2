package statemachine.typewriter;

public enum TypeWriterState {
    CAPS_OFF {
        @Override
        TypeWriterState nextLine() {
            return CAPS_ON;
        }
    },
    CAPS_ON {
        @Override
        TypeWriterState nextLine() {
            return CAPS_OFF;
        }
    };

    abstract TypeWriterState nextLine();
}
