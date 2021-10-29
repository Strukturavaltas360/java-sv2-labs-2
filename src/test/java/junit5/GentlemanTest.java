package junit5;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    public void testSayHello() {
        Gentleman gentleman = new Gentleman();
        assertEquals("Hello John Doe!", gentleman.sayHello("John Doe"));
        assertEquals("Hello Anonymous!", gentleman.sayHello(null));
    }
}
