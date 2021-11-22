package recursion;

import java.util.Locale;

public class Vowels {
    public int getNumberOfVowels(String word) {
        if (word == null || word.length() == 0) {
            return 0;
        } else {
            switch(word.toLowerCase().charAt(0)) {
                case 'a':
                case 'á':
                case 'e':
                case 'é':
                case 'i':
                case 'í':
                case 'o':
                case 'ó':
                case 'ö':
                case 'ő':
                case 'u':
                case 'ú':
                case 'ü':
                case 'ű':
                    return getNumberOfVowels(word.substring(1)) + 1;
                default:
                    return getNumberOfVowels(word.substring(1));
            }
        }
    }
}
