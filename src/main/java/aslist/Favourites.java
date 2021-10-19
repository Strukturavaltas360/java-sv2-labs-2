package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String answer = null;
        for (int i = 1; i <= 5 && (answer == null || answer.length() > 0); i++) {
            System.out.print("Adja meg " + i + ". kedencét (üres -> bevitel vége): ");
            answer = scanner.nextLine();
            if (answer.length() > 0) favouriteThings.add(answer);
        }

        System.out.println("Lista mérete: " + favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
