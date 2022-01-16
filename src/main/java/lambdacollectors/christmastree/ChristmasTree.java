package lambdacollectors.christmastree;

public class ChristmasTree {
    private PineTreeType type;
    private double height;

    public ChristmasTree(PineTreeType type, double height) {
        this.type = type;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "type=" + type +
                ", height=" + height +
                '}';
    }

    public PineTreeType getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }
}
