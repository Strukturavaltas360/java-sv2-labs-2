package stringbuilder;

public class PalindromeValidatorMain {
    public static void main(String[] args) {
        PalindromeValidator pv = new PalindromeValidator();
        String word = "Keretkarakterek";
        System.out.println(word + ": " + pv.isPalindrome(word));
        word = "étipipitér";
        System.out.println(word + ": " + pv.isPalindrome(word));
    }
}
