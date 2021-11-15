package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int first = calculator.getNumber(scanner, "Első egész szám: ");
        int second = calculator.getNumber(scanner, "Második egész szám: ");
        char operator = calculator.getOperator(scanner, "Alapműveleti operátor: ");

        if (calculator.isValid(operator)) {
            try {
                System.out.println(String.format("A kért művelet: %d %c %d", first, operator, second));
                System.out.println(String.format("Az eredmény: %d", calculator.calculate(first, second, operator)));
            }
            catch (ArithmeticException exception) {
                System.out.println(String.format("Kivétel: %s", exception.getMessage()));
            }
        } else {
            System.out.println("Hibás operátor!");
        }
    }

    public boolean isValid(char operator) {
        return operator == '+' ||
                operator == '-' ||
                operator == '*' ||
                operator == '/';
    }

    public int calculate(int first, int second, char operator) {
        switch (operator) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                return first / second;
        }
        return 0;
    }

    public int getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        int i = 0;
        try {
            i = scanner.nextInt();
        }
        catch (InputMismatchException exception) {
            System.out.println(String.format("Kivétel: %s", exception.getMessage()));
        }
        scanner.nextLine();
        return i;
    }

    public char getOperator(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String st = scanner.nextLine();
        char ch = ' ';
        try {
            ch = st.charAt(0);
        }
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println(String.format("Kivétel: %s", exception.getMessage()));
        }
        return ch;
    }
}
