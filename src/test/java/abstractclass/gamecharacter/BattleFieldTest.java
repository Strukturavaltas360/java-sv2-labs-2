package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {
    Archer archer = new Archer(new Point(0,0), new Random(0));
    AxeWarrior axeNear = new AxeWarrior(new Point(1,1), new Random(0));
    AxeWarrior axeFar = new AxeWarrior(new Point(5,1), new Random(0));
    BattleField battleField = new BattleField();

    @Test
    void fight1() {
        Character winner = battleField.fight(axeNear, archer);
        assertTrue(battleField.getRound() > 10 && battleField.getRound() < 30);
        assertEquals(axeNear, winner);
    }

    @Test
    void fight2() {
        Character winner = battleField.fight(axeFar, archer);
        assertTrue(battleField.getRound() > 10 && battleField.getRound() < 60);
        assertEquals(archer, winner);
    }
}