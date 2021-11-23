package methodpass.troopers;

public class Position {
    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        return Math.sqrt(
                Math.pow(position.posX - posX, 2) +
                Math.pow(position.posY - posY, 2));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
