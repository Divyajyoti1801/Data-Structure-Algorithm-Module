package StringProgram;

import java.util.*;

public class LongestRepeatingSubSequence {
    static List<String> al = new ArrayList<>();

    public static void main(String args[]) {
        String str = "axxxy";
        printAllSubSequence(str, "");
        System.out.println(al);
        System.out.println("Longest Common Repeating SubString length: " + longestRepeatingSubSequence(str));
    }

    // Understanding Sub-Sequence
    static void printAllSubSequence(String str, String ans) {
        if (str.length() == 0) {
            al.add(ans);
            return;
        }

        printAllSubSequence(str.substring(1), ans + str.charAt(0));
        printAllSubSequence(str.substring(1), ans);
    }

    // Longest repeating Sub-Sequence
    static int longestRepeatingSubSequence(String str) {
        int dp[][] = new int[str.length() + 1][str.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return findSimilar(str, str, 1, 1, dp);
    }

    static int findSimilar(String s, String u, int i, int j, int dp[][]) {
        if (i > s.length() || j > u.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (i != j && s.charAt(i - 1) == u.charAt(j - 1)) {
            return dp[i][j] = 1 + findSimilar(s, u, i + 1, j + 1, dp);
        } else {
            return dp[i][j] = Math.max(findSimilar(s, u, i + 1, j, dp), findSimilar(s, u, i, j + 1, dp));
        }

    }
}
