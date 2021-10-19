package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.print("Kérem a(z) " + i + ". számot: ");
            int next = scanner.nextInt();
            sum += next;
        }
        System.out.println("Összesen: " + sum);
    }
}