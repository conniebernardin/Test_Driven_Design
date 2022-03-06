import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void returnsTrueWhenInputPalindromic() {
        //GIVEN
        Palindrome palindrome = new Palindrome();
        String input = "madam";

        //WHEN
        boolean actual = palindrome.isPalindromic(input);

        //THEN
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsFalseWhenInputIsNotPalindromic() {
        //GIVEN
        Palindrome palindrome = new Palindrome();
        String input = "foo";

        //WHEN
        boolean actual = palindrome.isPalindromic(input);

        //THEN
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

}