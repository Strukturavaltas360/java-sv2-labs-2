package methodchain;

import static methodchain.Direction.NEGATIVE;
import static methodchain.Direction.POSITIVE;

public class Grasshopper {
    private int position;

    public Grasshopper hopOnce(Direction direction) {
        switch (direction) {
            case POSITIVE:
                position++;
                break;
            case NEGATIVE:
                position--;
                break;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        hopOnce(NEGATIVE).hopOnce(POSITIVE).hopOnce(POSITIVE).hopOnce(POSITIVE).hopOnce(POSITIVE);
    }

    public int getPosition() {
        return position;
    }

}
