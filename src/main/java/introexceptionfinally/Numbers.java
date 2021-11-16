package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = null;

        while (number == null || number % 2 != 0) {
            System.out.print("Adjon meg egy számot!: ");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                throw new IllegalStateException("Ez nem szám!", nfe);
            } finally {
                System.out.println("End of round.");
            }
        }
    }
}
