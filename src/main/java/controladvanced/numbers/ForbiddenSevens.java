package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kezdő pozitív egész szám: ");
        int nextNumber = scanner.nextInt() - 1;
        do {
            nextNumber++;
            if (nextNumber % 7 == 0) {
                System.out.println("X");
            } else {
                if (Integer.toString(nextNumber).indexOf('7') >= 0) {
                    break;
                }
                System.out.println(nextNumber);
            }
        } while(true);
    }
}
