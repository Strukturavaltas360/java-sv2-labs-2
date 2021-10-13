package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Új client objektum létrehozása");
        System.out.print("  Név: ");
        client.setName(scanner.nextLine());
        System.out.print("  Születési év: ");
        client.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.print("  Cím: ");
        client.setAddress(scanner.nextLine());
        System.out.print("  Új cím: ");
        client.migrate(scanner.nextLine());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("A client objektum atribútumai:");
        System.out.println("  Név: " + client.getName());
        System.out.println("  Születési év: " + client.getYear());
        System.out.println("  Cím: " + client.getAddress());
    }
}
