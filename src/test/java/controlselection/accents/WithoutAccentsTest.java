package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    @Test
    void testWithoutAccents() {
        WithoutAccents withoutAccents = new WithoutAccents();
        assertEquals('a', withoutAccents.withoutAccents('á'));
        assertEquals('O', withoutAccents.withoutAccents('Ő'));
        assertEquals('a', withoutAccents.withoutAccents('a'));
    }
}
