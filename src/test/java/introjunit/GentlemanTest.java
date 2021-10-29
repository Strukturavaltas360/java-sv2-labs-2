package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {
    @Test
    public void testSayHello() {
        Gentleman gentleman = new Gentleman();
        String name = "John Doe";
        String greeting = gentleman.sayHello(name);
        assertThat(greeting, equalTo("Hello " + name + "!"));
    }

    @Test
    public void testSayHelloAnonymous() {
        Gentleman gentleman = new Gentleman();
        assertThat(gentleman.sayHello(null), equalTo("Hello Anonymous!"));
    }
}
