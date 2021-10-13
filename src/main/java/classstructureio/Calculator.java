package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem adja meg az első számot: ");
        int i1 = scanner.nextInt();
        System.out.print("Kérem adja meg a második számot: ");
        int i2 = scanner.nextInt();
        System.out.println();
        System.out.println("A következő művelet fogom elvégezni: " + i1 + " + " + i2);
        System.out.println("A művelet eredménye: " + (i1 + i2));
        System.out.println(i1 + " + " + i2 + " = " + (i1 + i2));
    }
}
