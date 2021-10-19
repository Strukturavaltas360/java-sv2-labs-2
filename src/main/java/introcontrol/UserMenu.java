package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");
        int choice = scanner.nextInt();
        if (choice == 1)
            System.out.println("Felhasználók listázása");
        else if (choice == 2)
            System.out.println("Felhasználó felvétele");
    }
}
