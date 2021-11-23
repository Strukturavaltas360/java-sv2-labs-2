package methodchain;

import java.util.Locale;

public class ModifiedWord {
    public String modify(String word) {
        if (word == null || word.length() < 3) {
            throw new IllegalArgumentException("Kevesebb, mint 3 karakter hosszó string!");
        }
        return word.substring(0, 1).toUpperCase() + "x"
                + word.substring(2, 3).toUpperCase() + "y";
    }
}
