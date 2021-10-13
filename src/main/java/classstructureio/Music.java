package classstructureio;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song favoriteSong = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kedvenc dal?");
        System.out.print("  Előadója: ");
        favoriteSong.band = scanner.nextLine();
        System.out.print("  Címe: ");
        favoriteSong.title = scanner.nextLine();
        System.out.print("  Hossza [perc]: ");
        favoriteSong.length = scanner.nextInt();

        System.out.println();
        System.out.println("A kedvenc dal:");
        System.out.println(favoriteSong.band + " - " + favoriteSong.title
                + " (" + favoriteSong.length + " perc)");
    }
}
