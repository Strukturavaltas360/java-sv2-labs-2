package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class C3P0 implements MovableRobot {
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public C3P0(Point position) {
        walkTo(position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
        while (this.angle < 0) {
            this.angle += 360;
        }
        this.angle %= 360;
    }

    private void walkTo(Point position) {
        if (position.getZ() != 0) {
            throw new IllegalArgumentException("Can not change altitude!");
        }
        path.add(this.position = position);
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public List<Point> getPath() {
        return path;
    }
}
