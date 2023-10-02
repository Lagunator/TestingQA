package TareasFinde;

public class Palindrome {
    public boolean isPalindrome(String word) {
        word = word.replaceAll(" ", "").toLowerCase();
        String reversedWord = new StringBuilder(word).reverse().toString();

        return word.equals(reversedWord);
    }

}
