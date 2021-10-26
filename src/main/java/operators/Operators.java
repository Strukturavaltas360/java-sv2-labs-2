package operators;

public class Operators {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static String getResultOfDivision(int number, int divisor) {
        return number + "/" + divisor + "=" + (number / divisor) + " maradék: " + (number % divisor);
    }

    public static String isNull(String s) {
        return s == null ? "null értékű" : "nem null értékű";
    }

    public static boolean isEmpty(String s) {
        return s == null || (s.length() == 0);
    }
}
