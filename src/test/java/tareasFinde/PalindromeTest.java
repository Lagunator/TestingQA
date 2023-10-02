package tareasFinde;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testIsPalindromeWithPalindromeWord() {
        Palindrome palindromeChecker = new Palindrome();
        assertTrue(palindromeChecker.isPalindrome("oro"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        Palindrome palindromeChecker = new Palindrome();
        assertFalse(palindromeChecker.isPalindrome("jose"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        Palindrome palindromeChecker = new Palindrome();
        assertTrue(palindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithWhitespace() {
        Palindrome palindromeChecker = new Palindrome();
        assertTrue(palindromeChecker.isPalindrome("Hola buenas"));
    }

    @Test
    public void testIsPalindromeWithMixedCase() {
        Palindrome palindromeChecker = new Palindrome();
        assertTrue(palindromeChecker.isPalindrome("Ricardo no puede leer fluido"));
    }
}

