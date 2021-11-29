package abstractclass.gamecharacter;

public class Point {
    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point from) {
        return Math.sqrt(Math.pow(from.x - x, 2) + Math.pow(from.y - y, 2));
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
