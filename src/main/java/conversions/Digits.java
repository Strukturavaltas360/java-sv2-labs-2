package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {
    private List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {
        Digits digits = new Digits();
        String text = "Az int típus ábrázolási tartományának határa pozitív irányban 2_147_483_647";
        digits.addDigitsToList(text);
        System.out.println(text);
        System.out.println(digits.getIntegers());
    }

    public void addDigitsToList(String text) {
        for (char ch: text.toCharArray()) {
            if (Character.isDigit(ch))
                integers.add(Integer.parseInt(Character.toString(ch)));
        }
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
