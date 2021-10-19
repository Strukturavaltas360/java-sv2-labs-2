package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println("PI: " + CircleCalculator.PI);
        System.out.println("calculatePerimeter(1): " + CircleCalculator.calculatePerimeter(1));
        System.out.println("calculateArea(1): " + CircleCalculator.calculateArea(1));

        System.out.println("CylinderCalculator.calculateSurfaceArea(1, 2): " + CylinderCalculator.calculateSurfaceArea(1, 2));
        System.out.println("CylinderCalculator.calculateVolume(1, 2): " + CylinderCalculator.calculateVolume(1, 2));

        System.out.println("CylinderCalculatorBasedOnCircle.calculateSurfaceArea(1, 2): " + CylinderCalculatorBasedOnCircle.calculateSurfaceArea(1, 2));
        System.out.println("CylinderCalculatorBasedOnCircle.calculateVolume(1, 2): " + CylinderCalculatorBasedOnCircle.calculateVolume(1, 2));
    }
}
