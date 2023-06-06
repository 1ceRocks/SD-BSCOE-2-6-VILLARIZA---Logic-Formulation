/* Palindrome Check (VILLARIZA | BSCOE 2-6 2022-2023)
Software Design (CMPE 30074)

A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward. */

public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        for(int i = original.length() - 1; i>=0; i--) {
            reversed += original.charAt(i);
            System.out.println(reversed);
        }

        // check for palindrome word case
        boolean palindrome = true;
        for(int i=0; i < original.length(); i++) {
            if(original.charAt(i) != reversed.charAt(i)) {
                palindrome = false;
            }
        } if(!palindrome) {
            System.out.println("This word is NOT a palindrome.");
        } else {
            System.out.println("This word is a palindrome.");
        }
    }
}