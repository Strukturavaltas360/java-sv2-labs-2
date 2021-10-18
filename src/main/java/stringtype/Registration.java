package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Név: ");
        String name = scanner.nextLine();
        System.out.print("Jelszó: ");
        String password1 = scanner.nextLine();
        System.out.print("Jelszó még egyszer: ");
        String password2 = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        UserValidator validator = new UserValidator();

        System.out.println("Felhasználónév: " + (validator.isValidUsername(name) ? "OK" : "NOK"));
        System.out.println("Jelszó: " + (validator.isValidPassword(password1, password1) ? "OK" : "NOK"));
        System.out.println("Email: " + (validator.isValidEmail(email) ? "OK" : "NOK"));
    }
}
