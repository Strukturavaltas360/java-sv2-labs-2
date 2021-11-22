package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void getMin() {
        Temperature temperature = new Temperature();
        List<Integer> temperatures = Arrays.asList(10, 5, 15, 3, 10, 6);
        assertEquals(3, temperature.getMin(temperatures));
    }
}