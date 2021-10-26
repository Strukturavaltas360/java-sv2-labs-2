package numbers;

import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Első szám: ");
        int first = scanner.nextInt();
        System.out.print("Második szám: ");
        int second = scanner.nextInt();
        System.out.println(first + " " + second + "%-a: " + getValue(first, second));
        System.out.println("Minek " + second + "%-a " + first + ": " + getBase(first, second));
        System.out.println("Hány %-a " + second + " a " + first + "-nak: " + getPercent(first, second));
    }

    static double getValue(int number, int percent) {
        return (double) number * percent / 100;
    }

    static double getBase(int number, int percent) {
        return 100.0 * number / percent;
    }

    static double getPercent(int base, int number) {
        return 100.0 * number / base;
    }
}
