package StringProgram;

public class LongestPalindromeInString {
    public static void main(String args[]) {
        String S = "vnrtysfrzrmzlygfv";
        System.out.println("The Longest Palindrome substring:" + longestPalindromeSubString(S));
    }

    static String longestPalindromeSubString(String S) {
        return S;

    }

    static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
