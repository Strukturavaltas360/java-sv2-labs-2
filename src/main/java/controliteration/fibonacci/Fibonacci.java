package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        System.out.print("A fibonacci sorozat hanyadik elemét írjam ki? ");
        int index = scanner.nextInt();

        System.out.println("for ciklussal: " + fibonacci.getFibonacciFor(index));
        System.out.println("do ciklussal: " + fibonacci.getFibonacciDo(index));
        System.out.println("rekurzív fügvényhívással: " + fibonacci.getFibonacciRecursive(index));
    }

    int getFibonacciRecursive(int index) {
        if (index == 0 || index == 1) {
            return index;
        } else if (index >= 2) {
            return getFibonacciRecursive(index - 2) + getFibonacciRecursive(index -1);
        } else {
            return -1;
        }
    }

    int getFibonacciFor(int index) {
        if (index < 0) return -1;

        int[] fibonaccis = new int[index + 1];
        fibonaccis[0] = 0;
        if (index > 0) {
            fibonaccis[1] = 1;
        }

        for (int i = 2; i <= index; i++) {
            fibonaccis[i] = fibonaccis[i - 2] + fibonaccis[i - 1];
        }

        return fibonaccis[index];
    }

    int getFibonacciDo(int index) {
        if (index < 0) return -1;

        int[] fibonaccis = new int[index + 1];
        int i = -1;
        do {
            i++;
            if (i == 0 || i == 1) {
                fibonaccis[i] = i;
            } else {
                fibonaccis[i] = fibonaccis[i - 2] + fibonaccis[i - 1];
            }
        } while (i < index);

        return fibonaccis[index];
    }
}
