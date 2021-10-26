package chars;

public class Whitespace {
    public static void main(String[] args) {
        System.out.println(makeWhitespaceToStar("alma körte\nszilva"));
    }

    static String makeWhitespaceToStar(String text) {
        String result = "";
        for (char ch: text.toCharArray()) {
            result += Character.isWhitespace(ch) ? '*' : ch;
        }
        return result;
    }
}
