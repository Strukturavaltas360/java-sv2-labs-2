package stringbasic.characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a szót: ");
        String word = scanner.nextLine();
        System.out.println();
        System.out.println("Betűzze le ezt a szót: " + word);

        List<Character> chars = new ArrayList<>();
        String inputChar = null;
        for (int i = 0; inputChar == null || inputChar.length() == 1; i++) {
            System.out.print((i + 1) + ". karakter (üres -> vége a bevitelnek): ");
            inputChar = scanner.nextLine();
            if (inputChar.length() == 1) chars.add(inputChar.charAt(0));
        }

        System.out.println(chars);
        String inputString = "";
        for (char ch: chars) inputString += ch;
        System.out.println(inputString);
        System.out.println(word.equals(inputString) ? "Helyes" : "Helytelen gépelés!");

    }
}
