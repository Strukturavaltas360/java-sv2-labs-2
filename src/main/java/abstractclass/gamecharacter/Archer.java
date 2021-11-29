package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {
    private int numberOfArrow;

    public Archer(Point position, Random random) {
        super(position, random);
        numberOfArrow = 100;
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(1, 6);
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
