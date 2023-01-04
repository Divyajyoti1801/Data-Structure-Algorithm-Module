package DynamicProgrammingTwo;

import java.util.Arrays;

public class LongestRepeatedSubSequence {
    public static void main(String args[]) {
        String str = "axxzxy";
        System.out.println("The Longest Repeated Sub Sequence: " + longestRepeatedSubSequence(str));

    }

    static int longestRepeatedSubSequence(String str) {
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
