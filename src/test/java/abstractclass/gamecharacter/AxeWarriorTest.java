package abstractclass.gamecharacter;

import methodpass.troopers.Position;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {
    AxeWarrior axe1 = new AxeWarrior(new Point(0,0), new Random(0));
    AxeWarrior axe2 = new AxeWarrior(new Point(1,1), new Random(0));
    AxeWarrior axe3 = new AxeWarrior(new Point(2,2), new Random(0));

    @Test
    void secondaryAttack() {
        for (int i = 0; i < 30; i++) {
            axe1.secondaryAttack(axe2);
            axe1.secondaryAttack(axe3);
        }
        assertFalse(axe2.isAlive());
        assertEquals(100, axe3.getHitPoint());
    }
}