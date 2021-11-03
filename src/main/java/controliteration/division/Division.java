package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int max = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();

        System.out.println("for ciklussal:");
        for (int i = divisor ; i < max ; i += divisor) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("while ciklussal:");
        int i = divisor;
        while (i < max) {
            System.out.print(i + ", ");
            i += divisor;
        }
    }
}
