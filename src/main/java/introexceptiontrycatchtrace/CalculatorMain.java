package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int firstInt = 0;
        int secondInt = 0;
        char operator = ' ';

        try {
            firstInt = calculator.getNumber(scanner, "Első egész szám: ");
        }
        catch (NumberFormatException exception) {
            System.out.println(String.format("Kivétel: %s", exception.getMessage()));
        }

        try {
            secondInt = calculator.getNumber(scanner, "Második egész szám: ");
        }
        catch (NumberFormatException exception) {
            System.out.println(String.format("Kivétel: %s", exception.getMessage()));
        }

        try {
            operator = calculator.getOperator(scanner, "Alapműveleti operátor: ");
        }
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println(String.format("Kivétel: %s", exception.getMessage()));
        }

        System.out.println(String.format("A kért művelet: %d %c %d", firstInt, operator, secondInt));
        if (calculator.isValid(operator)) {
            switch(operator) {
                case '+':
                    System.out.println(calculator.add(firstInt, secondInt));
                    break;
                case '-':
                    System.out.println(calculator.subtract(firstInt, secondInt));
                    break;
                case '*':
                    System.out.println(calculator.multiply(firstInt, secondInt));
                    break;
                case '/':
                    try {
                        System.out.println(calculator.divide(firstInt, secondInt));
                    }
                    catch (ArithmeticException exception) {
                        System.out.println(String.format("Kivétel: %s", exception.getMessage()));
                    }
                    break;
            }
        } else {
            System.out.println("Hibás operátor!");
        }
    }
}
