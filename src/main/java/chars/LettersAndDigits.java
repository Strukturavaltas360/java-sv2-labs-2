package chars;

public class LettersAndDigits {
    public static void main(String[] args) {
        printLetterOrDigit("bfa68fF;Xő");
    }

    static void printLetterOrDigit(String text) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            String classification;
            if (Character.isDigit(c)) classification = "számjegy";
            else if (Character.isLetter(c)) classification = "betű";
            else classification = "egyéb";
            System.out.println(c + " : " + classification);
        }
    }
}
