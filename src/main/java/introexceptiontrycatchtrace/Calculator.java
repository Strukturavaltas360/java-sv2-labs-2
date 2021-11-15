package introexceptiontrycatchtrace;

import java.util.Scanner;

public class Calculator {

    public boolean isValid(char operator) {
        return operator == '+' ||
                operator == '-' ||
                operator == '*' ||
                operator == '/';
    }

    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;
    }

    public int getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String st = scanner.nextLine();
        return Integer.parseInt(st);
    }

    public char getOperator(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String st = scanner.nextLine();
        return st.charAt(0);
    }
}
