package controlselection.accents;

public class WithoutAccents {
    public char withoutAccents(char letter) {
        String accented = "áÁéÉíÍóÓöÖőŐúÚűŰ";
        String woAccent = "aAeEiIoOoOoOuUuU";

        int index = accented.indexOf(letter);
        if (index >= 0) {
            return woAccent.charAt(index);
        } else {
            return letter;
        }
    }
}
