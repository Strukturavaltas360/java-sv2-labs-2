package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return word.equalsIgnoreCase(sb.toString());
    }
}
