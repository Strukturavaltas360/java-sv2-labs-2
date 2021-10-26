package chars;

public class Words {
    public static void main(String[] args) {
        System.out.println(pushWord("alma"));
    }

    static String pushWord(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += (char) (word.charAt(i) + 1);
        }
        return result;
    }
}
