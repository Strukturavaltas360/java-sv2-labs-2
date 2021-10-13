package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Új client objektum létrehozása");
        System.out.print("  Név: ");
        client.name = scanner.nextLine();
        System.out.print("  Születési év: ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("  Cím: ");
        client.address = scanner.nextLine();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("A client objektum atribútumai:");
        System.out.println("  Név: " + client.name);
        System.out.println("  Születési év: " + client.year);
        System.out.println("  Cím: " + client.address);
    }
}
