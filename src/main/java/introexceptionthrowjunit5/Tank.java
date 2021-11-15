package introexceptionthrowjunit5;

public class Tank {
    int angle = 0;

    public  void modifyAngle(int angleNumber) {
        int newAngle = (angle + angleNumber) % 360;
        if (newAngle < -80 || newAngle > 80) {
            throw new IllegalArgumentException("Nem lehet a csövet ebbe az irányba állítani!");
        }
        angle = newAngle;
    }

    public int getAngle() {
        return angle;
    }
}
