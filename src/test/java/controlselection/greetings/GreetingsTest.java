package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GreetingsTest {
    Greetings greetings = new Greetings();

    @Test
    void testGoodNight() {
        String goodNight = "Jó éjt";
        assertEquals(goodNight, greetings.getGreeting(1, 50));
        assertEquals(goodNight, greetings.getGreeting(4, 59));
        assertNotEquals(goodNight, greetings.getGreeting(5, 1));
        assertNotEquals(goodNight, greetings.getGreeting(19, 59));
        assertEquals(goodNight, greetings.getGreeting(20, 00));
        assertEquals(goodNight, greetings.getGreeting(21, 00));
    }

    @Test
    void testGoodMorning() {
        String goodMorning = "Jó reggelt";
        assertNotEquals(goodMorning, greetings.getGreeting(1, 50));
        assertEquals(goodMorning, greetings.getGreeting(5, 1));
        assertEquals(goodMorning, greetings.getGreeting(6, 10));
        assertEquals(goodMorning, greetings.getGreeting(8, 59));
        assertNotEquals(goodMorning, greetings.getGreeting(9, 0));
        assertNotEquals(goodMorning, greetings.getGreeting(11, 0));
    }

    @Test
    void testGoodAfternoon() {
        String goodAfternoon = "Jó napot";
        assertNotEquals(goodAfternoon, greetings.getGreeting(1, 50));
        assertEquals(goodAfternoon, greetings.getGreeting(9, 0));
        assertEquals(goodAfternoon, greetings.getGreeting(12, 10));
        assertEquals(goodAfternoon, greetings.getGreeting(18, 29));
        assertNotEquals(goodAfternoon, greetings.getGreeting(18, 30));
        assertNotEquals(goodAfternoon, greetings.getGreeting(21, 0));
    }

    @Test
    void testGoodEvening() {
        String goodEvening = "Jó estét";
        assertNotEquals(goodEvening, greetings.getGreeting(11, 50));
        assertEquals(goodEvening, greetings.getGreeting(18, 30));
        assertEquals(goodEvening, greetings.getGreeting(19, 10));
        assertEquals(goodEvening, greetings.getGreeting(19, 59));
        assertNotEquals(goodEvening, greetings.getGreeting(20, 0));
        assertNotEquals(goodEvening, greetings.getGreeting(21, 0));
    }
}
