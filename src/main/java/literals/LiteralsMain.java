package literals;

import java.util.Locale;

public class LiteralsMain {
    public static void main(String[] args) {
        String st1 = 1 + "" + 2;
        System.out.println(st1);

        double quotient = 3/ 4;
        System.out.println(quotient);
        quotient = 3d/ 4;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
