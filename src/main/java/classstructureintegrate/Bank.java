package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String accountNumber;
        String owner;
        int balance;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg az adatokat");
        System.out.print("  Számlaszám: ");
        accountNumber = scanner.nextLine();
        System.out.print("  Név: ");
        owner = scanner.nextLine();
        System.out.print("  Egyenleg [Ft]: ");
        balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount acc = new BankAccount(accountNumber, owner, balance);

        System.out.println();
        System.out.println(acc.getInfo());

        System.out.print("Befizetés [Ft]: ");
        acc.deposit(scanner.nextInt());
        scanner.nextLine();
        System.out.println(acc.getInfo());

        System.out.print("Kifizetés [Ft]: ");
        acc.withdraw(scanner.nextInt());
        scanner.nextLine();
        System.out.println(acc.getInfo());
    }
}
