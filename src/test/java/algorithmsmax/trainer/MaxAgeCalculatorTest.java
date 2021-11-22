package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void getTrainerWithMaxAge() {
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Sándor", 54),
                new Trainer("József", 50),
                new Trainer("Benedek", 59),
                new Trainer("Elek", 40));
        assertEquals("Benedek", maxAgeCalculator.getTrainerWithMaxAge(trainers).getName());
    }
}