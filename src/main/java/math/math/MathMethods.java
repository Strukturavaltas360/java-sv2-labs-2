package math.math;

public class MathMethods {
    public static void main(String[] args) {
        System.out.println("max(4,7): " + Math.max(4, 7));
        System.out.println("min(4,7): " + Math.min(4, 7));
        System.out.println("pi: " + Math.PI);
        System.out.println("round(pi): " + Math.round(Math.PI));
        System.out.println("round(5.678): " + Math.round(5.678));
        System.out.println("abs(-5.6): " + Math.abs(-5.6));
        System.out.println("negateExact(1): " + Math.negateExact(1));
        System.out.println("negateaddExact(1, 2): " + Math.addExact(1, 2));
        System.out.println("subtractExact(1, 2): " + Math.subtractExact(1, 2));
        System.out.println("multiplyExact(1, 2): " + Math.multiplyExact(1, 2));
        System.out.println("pow(10, 2.5): " + Math.pow(10, 2.5));
        System.out.println("incrementExact(3): " + Math.incrementExact(3));
        System.out.println("decrementExact(3): " + Math.decrementExact(3));
        System.out.println("random(): " + Math.random());
    }
}
