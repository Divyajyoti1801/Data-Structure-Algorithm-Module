package StringProgram;

public class PalindromeString {
    public static void main(String args[]) {
        String str = "abc";
        System.out.println("The String is Palindrome or not: " + checkPalindrome(str));
    }

    static int checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
