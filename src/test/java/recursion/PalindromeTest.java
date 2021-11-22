package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(null));
        assertTrue(palindrome.isPalindrome("k"));
        assertTrue(palindrome.isPalindrome("kelepelek"));
        assertFalse(palindrome.isPalindrome("kelepelik"));
    }
}