package Recursion;

public class PalindromeString {
    public static void main(String args[]) {
        String str = "acbcaa";
        System.out.println("Is this is a palindrome string ('acbca'): " + palindromeString(str, 0, str.length() - 1));

    }

    public static boolean palindromeString(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return ((str.charAt(start) == str.charAt(end)) && palindromeString(str, start + 1, end - 1));
    }
}
