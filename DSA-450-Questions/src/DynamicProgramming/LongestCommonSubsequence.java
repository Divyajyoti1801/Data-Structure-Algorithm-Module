package DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String args[]) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(
                "Longest Common SubSequence (Recursion): " + LCSRecursion(str1, str2, str1.length(), str2.length()));
        int memo[][] = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length() + 1; i++) {
            for (int j = 0; j < str2.length() + 1; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println("Longest Common SubSequence (Memoization): "
                + LCSMemoization(str1, str2, str1.length(), str2.length(), memo));
        System.out.println(
                "Longest Common SubSequence (Tabulation): " + LCSTabulation(str1, str2));

    }

    // Method-1: Recursion
    static int LCSRecursion(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return LCSRecursion(str1, str2, n - 1, m - 1) + 1;
        } else {
            int ans1 = LCSRecursion(str1, str2, n - 1, m);
            int ans2 = LCSRecursion(str1, str2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    static int LCSMemoization(String str1, String str2, int n, int m, int[][] memo) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (memo[n][m] != -1) {
            return memo[n][m];
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            memo[n][m] = 1 + LCSMemoization(str1, str2, n - 1, m - 1, memo);
            return memo[n][m];
        }
        memo[n][m] = Math.max(LCSMemoization(str1, str2, n - 1, m, memo), LCSMemoization(str1, str2, n, m - 1, memo));
        return memo[n][m];
    }

    static int LCSTabulation(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

}
