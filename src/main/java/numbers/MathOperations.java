package numbers;

import java.util.Random;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(1, 10);
        int b = random.nextInt(1, 10);
        int c = random.nextInt(1, 10);
        int d = random.nextInt(1, 10);
        int e = random.nextInt(1, 10);
        System.out.println("Adja meg a feladat eredményét");
        System.out.print(printCalculation(a, b, c, d, e));
        double userInput = scanner.nextDouble();
        double result = calculate(a, b, c, d, e);
        System.out.println(Math.abs(userInput - result) < 0.0001 ? "Helyes!" : "Hibás megoldás!");
    }

    static double calculate(int a, int b, int c, int d, int e) {
        return (double) ((a + b) * (c - d)) / e;
    }

    static String printCalculation(int a, int b, int c, int d, int e) {
        return "((" + a + " + " + b + ") * (" + c + " - " + d + ")) / " + e + " = ";
    }
}
