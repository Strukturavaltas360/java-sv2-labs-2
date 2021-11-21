package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {
    @Test
    void createTest() {
        Trainer trainer = new Trainer("Csaba", 57);
        assertEquals("Csaba", trainer.getName());
        assertEquals(57, trainer.getAge());
    }

}