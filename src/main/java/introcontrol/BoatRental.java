package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hányan érkeztek?: ");
        int  numberOfRenter = scanner.nextInt();
        if (numberOfRenter <= 2) {
            System.out.println("Kiadva: kétszemélyes csónak");
            System.out.println("Még maximum 8 személy kölcsönözhet!");
        } else if (numberOfRenter == 3) {
            System.out.println("Kiadva: háromszemélyes csónak");
            System.out.println("Még maximum 7 személy kölcsönözhet!");
        } else if (numberOfRenter <= 5) {
            System.out.println("Kiadva: ötszemélyes csónak");
            System.out.println("Még maximum 5 személy kölcsönözhet!");
        } else if (numberOfRenter <= 7) {
            System.out.println("Kiadva: öt- és kétszemélyes csónak");
            System.out.println("Még maximum 3 személy kölcsönözhet!");
        } else if (numberOfRenter == 8) {
            System.out.println("Kiadva: öt- és háromszemélyes csónak");
            System.out.println("Még maximum 2 személy kölcsönözhet!");
        } else if (numberOfRenter <= 10) {
            System.out.println("Kiadva: öt-, három- és kétszemélyes csónak");
            System.out.println("Minden csónak kiadva!");
        } else {
            System.out.println("Kiadva: öt-, három- és kétszemélyes csónak");
            System.out.println((numberOfRenter - 10) + " személy a parton maradt!");
        }
    }
}
