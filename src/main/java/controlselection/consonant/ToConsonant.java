package controlselection.consonant;

public class ToConsonant {
    public char toConsonant(char letter) {
        char result = 0;
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = (char) (letter + 1);
                break;
            default:
                result = letter;
        }
        return result;
    }
}
