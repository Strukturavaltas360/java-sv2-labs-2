package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Befektetés összege: ");
        int fund = scanner.nextInt();
        System.out.print("Kamatláb [%]: ");
        int interestRate = scanner.nextInt();
        Investment investment = new Investment(fund, interestRate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYields(50));
        double total = investment.close(80);
        System.out.println(" Kivett összeg 80 nap után: " + total);
        total = investment.close(90);
        System.out.println(" Kivett összeg 90 nap után: " + total);
    }
}
