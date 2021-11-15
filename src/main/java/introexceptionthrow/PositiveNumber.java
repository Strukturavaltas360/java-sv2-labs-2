package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérek egy pozitív számot: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new IllegalArgumentException(String.format("Negatív szám nem megengedett! (%d)", number));
        }
        System.out.println("Vége");
    }
}
