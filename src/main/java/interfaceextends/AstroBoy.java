package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    private static final long ALTITUDE = 5;

    public AstroBoy(Point position) {
        walkTo(position);
    }

    @Override
    public void liftTo(long altitude) {
        path.add(this.position = new Point(
                position.getX(),
                position.getY(),
                altitude));
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        path.add(this.position = new Point(
                position.getX(),
                position.getY(),
                ALTITUDE));
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
        while (this.angle < 0) {
            this.angle += 360;
        }
        this.angle %= 360;
    }

    @Override
    public List<Point> getPath() {
        return path;
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
}
