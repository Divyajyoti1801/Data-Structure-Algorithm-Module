package StringProgram;

import java.util.Arrays;

public class CheckValidShuffle {
    public static void main(String args[]) {
        String first = "XY";
        String second = "12";
        String[] result = { "1XY2", "Y1X2", "Y21XX" };
        for (String res : result) {
            if (checkLength(first, second, res) == true && checkValidShuffle(first, second, res) == true) {
                System.out.println(res + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(res + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }

    static boolean checkLength(String first, String second, String result) {
        if (first.length() + second.length() != result.length()) {
            return false;
        }
        return true;
    }

    static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);
        return str;
    }

    static boolean checkValidShuffle(String first, String second, String result) {
        first = sortString(first);
        second = sortString(second);
        result = sortString(result);
        int i = 0, j = 0, k = 0;
        while (k != result.length()) {
            if (i < first.length() && first.charAt(i) == result.charAt(k)) {
                i++;
            } else if (j < second.length() && second.charAt(j) == result.charAt(j)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        if (i < first.length() || j < second.length()) {
            return false;
        }
        return true;
    }
}
