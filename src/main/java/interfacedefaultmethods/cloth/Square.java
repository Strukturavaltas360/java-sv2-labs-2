package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return Math.sqrt(2 * getSide() * getSide());
    }

    default double getPerimeter() {
        return 4 * getSide();
    }

    default double getArea() {
        return getSide() * getSide();
    }

    abstract double getSide();
}
