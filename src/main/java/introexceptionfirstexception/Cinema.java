package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vásárló neve? ");
        String name = scanner.nextLine();
        System.out.print("Melyik filmre kér jegyet? ");
        String title = scanner.nextLine();
        System.out.print("Hány jegyet kér? ");
        int amountOfTickets = scanner.nextInt();
        System.out.print("Melyik sor? ");
        int row = scanner.nextInt();

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println(String.format("Vásárló neve: %s", name));
        System.out.println(String.format("Film címe: %s", title));
        Cinema cinema = new Cinema();
        System.out.println(String.format("Lefoglalt helyek: %s", cinema.getPlaces(amountOfTickets, row)));
        System.out.println("Jó szórakozást!");
    }

    private String getPlaces(int amountOfTickets, int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < amountOfTickets; i++) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(String.format("%d. sor %d. szék"), row, i);
        }
        return sb.toString();
    }
}
