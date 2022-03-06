import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Palindrome palindrome = new Palindrome();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (palindrome.isPalindromic(input)){
        System.out.println("yes");}
        else {
            System.out.println("no");
            }
        }

    }
