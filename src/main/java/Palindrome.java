public class Palindrome {

    public boolean isPalindromic(String input){

        boolean isPalindrome = false;

        String inputLetters = input;
        String inputReverse = "";
        for (int i= inputLetters.length()-1; i>=0; i--){
            inputReverse+= inputLetters.charAt(i);
            if(inputReverse.length() == inputLetters.length()){
                break;
            }
        }

        if (inputLetters.equals(inputReverse)){
            isPalindrome = true;
        }

        return isPalindrome;
    }


}
