package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {
    Archer a1 = new Archer(new Point(1,1), new Random(1));
    Archer a2 = new Archer(new Point(2,2), new Random(1));

    @Test
    void getActualPrimaryDamage() {
        int min = 0;
        int max = 0;
        for (int i = 0 ; i < 30 ; i++) {
            int actual = a1.getActualPrimaryDamage();
            if (i == 0) {
                min = actual;
                max = actual;
            } else {
                if (actual < min) {
                    min = actual;
                }
                if (actual > max) {
                    max = actual;
                }
            }
        }
        assertEquals(1, min);
        assertEquals(10, max);
    }

    @Test
    void hit() {
        assertEquals(100, a2.getHitPoint());
        for (int i = 0; i < 9; i++) {
            a1.hit(a2, 10);
            assertTrue(a2.isAlive());
        }
        assertEquals(10, a2.getHitPoint());
        a1.hit(a2, 10);
        assertEquals(0, a2.getHitPoint());
        assertFalse(a2.isAlive());
    }

    @Test
    void primaryAttack() {
        a1.primaryAttack(a2);
        assertEquals(94, a2.getHitPoint());
    }

    @Test
    void secondaryAttack() {
        a1.secondaryAttack(a2);
        assertEquals(99, a1.getNumberOfArrow());
        assertEquals(100, a2.getHitPoint());
        a1.secondaryAttack(a2);
        a1.secondaryAttack(a2);
        assertEquals(97, a2.getHitPoint());
    }
}