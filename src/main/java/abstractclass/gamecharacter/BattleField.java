package abstractclass.gamecharacter;

public class BattleField {
    private int round;

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
        }
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.secondaryAttack(defender);
        }
        return attacker.isAlive() && defender.isAlive();
    }

    public Character fight(Character one, Character other) {
        int startingRound = round;
        boolean bothIsAlive = one.isAlive() && other.isAlive();
        while (bothIsAlive) {
            round ++;
            if ((round - startingRound) % 2 == 1) {
                bothIsAlive = oneHit(one, other);
            } else {
                bothIsAlive = oneHit(other, one);
            }
        }
        return one.isAlive() ? one : other;
    }

    public int getRound() {
        return round;
    }
}
