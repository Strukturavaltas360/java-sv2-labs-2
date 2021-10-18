package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem adja meg egy egész számot: ");
        int number = scanner.nextInt();

        System.out.println(number % 3 == 0 ? "Osztható 3-mal" : "Nem osztható 3-mal");
    }
}
