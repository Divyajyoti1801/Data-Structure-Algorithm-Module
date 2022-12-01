package StringProgram;

public class LongestPalindromeInString {
    public static void main(String args[]) {
        String S = "abc";
        System.out.println("The Longest Palindrome substring:" + longestPalindromeSubString(S));
        System.out.println("The Longest Palindrome substring:" + longestPalindromeString(S));
    }

    static String longestPalindromeSubString(String S) {
        // Program is successful but it takes more time than expected.
        String result = "";
        int max_length = Integer.MIN_VALUE;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String newString = S.substring(i, j);
                if (checkPalindrome(newString)) {
                    if (max_length < newString.length()) {
                        max_length = newString.length();
                        result = new String(newString);
                    }
                }
            }

        }
        if (result.length() == 0) {
            result = new String(S.substring(0, 1));
        }

        return result;

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

    static String reverseOfString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Learning an Optimized Code
    static String longestPalindromeString(String S) {
        int len = 1;
        int n = S.length() - 1;
        String str = "" + S.charAt(0);
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                if ((j - i) > len) {
                    int start = n - j + 1;
                    int end = n - i + 1;
                    String substr = S.substring(i, j);
                    boolean check = substr.equals(reverseOfString(S).substring(start, end));
                    if (check) {
                        len = substr.length();
                        str = substr;
                    }

                }

            }
        }
        return str;
    }
}
