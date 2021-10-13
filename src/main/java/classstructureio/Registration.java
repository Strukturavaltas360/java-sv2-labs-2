package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A regisztrációhoz kérem adja meg a következő adatokat!");
        System.out.print("  Név: ");
        String name = scanner.nextLine();
        System.out.print("  Email cím: ");
        String email = scanner.nextLine();
        System.out.println();
        System.out.println("Az ön által megadott adatok a következőek:");
        System.out.println("  név: " + name + ", email:" + email);
    }
}
