package interfacerules;

public final class ParkingPlace implements Length, Width {
    private final double length = 5.0;
    private final double width = 2.2;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
