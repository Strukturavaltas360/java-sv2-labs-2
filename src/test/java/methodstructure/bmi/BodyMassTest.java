package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {
    BodyMass bmi1 = new BodyMass(94, 1.88);
    BodyMass bmi2 = new BodyMass(60, 1.82);

    @Test
    void getBodyMassIndex() {
        assertEquals(94 / 1.88 / 1.88, bmi1.getBodyMassIndex());
    }

    @Test
    void getBody() {
        assertEquals(BmiCategory.OVERWEIGHT, bmi1.getBody());
        assertEquals(BmiCategory.UNDERWEIGHT, bmi2.getBody());
    }

    @Test
    void isThinnerThan() {
        assertFalse(bmi1.isThinnerThan(bmi2));
    }
}