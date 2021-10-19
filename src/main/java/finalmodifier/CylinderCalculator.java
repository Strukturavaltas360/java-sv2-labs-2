package finalmodifier;

public class CylinderCalculator {
    public static double calculateVolume(double r, double h) {
        return CircleCalculator.PI * r * r * h;
    }

    public static double calculateSurfaceArea(double r, double h) {
        return CircleCalculator.PI * 2 * r * h;
    }
}
