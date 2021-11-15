package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérek egy legfeljebb 5 betűs szót! ");
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException(String.format("Túl hosszú (%d karakter) szó!", word.length()));
        }
        for (char ch: word.toCharArray()) {
            if (!Character.isLetter(ch)) {
                throw new IllegalArgumentException(String.format("A szó nemcsak betűket (%c) tartalmaz!", ch));
            }
        }
        System.out.println(String.format("Helyes szó: %s", word));
    }
}
