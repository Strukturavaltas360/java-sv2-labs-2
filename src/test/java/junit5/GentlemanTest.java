package junit5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    public void testSayHello() {
        Gentleman gentleman = new Gentleman();
        assertEquals(gentleman.sayHello("John Doe"), "Hello John Doe!");
        assertEquals(gentleman.sayHello(null), "Hello Anonymous!");
    }
}
