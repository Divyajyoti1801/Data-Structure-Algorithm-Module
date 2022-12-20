package DynamicProgrammingTwo;

public class LongestCommonSubsequence {
    public static void main(String args[]) {
        String s1 = "ABC";
        String s2 = "AC";
        System.out.println("Longest Common Subsequence(Recursion): " + LCSRecursion(s1, s2, s1.length(), s2.length()));
        int memo[][] = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length() + 1; i++) {
            for (int j = 0; j < s2.length() + 1; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println(
                "Longest Common Subsequence(Memoization): " + LCSMemoization(s1, s2, s1.length(), s2.length(), memo));
        System.out
                .println("Longest Common Subsequence(Tabulation): " + LCSTabulation(s1.length(), s2.length(), s1, s2));

    }

    // Recursion Approch
    static int LCSRecursion(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + LCSRecursion(s1, s2, n - 1, m - 1);
        } else {
            int ans1 = LCSRecursion(s1, s2, n - 1, m);
            int ans2 = LCSRecursion(s1, s2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    // Memoization Approach
    static int LCSMemoization(String s1, String s2, int n, int m, int memo[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (memo[n][m] != -1) {
            return memo[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return memo[n][m] = 1 + LCSRecursion(s1, s2, n - 1, m - 1);

        } else {
            int ans1 = LCSRecursion(s1, s2, n - 1, m);
            int ans2 = LCSRecursion(s1, s2, n, m - 1);
            return memo[n][m] = Math.max(ans1, ans2);
        }
    }

    // Tabulation Approach
    static int LCSTabulation(int x, int y, String s1, String s2) {
        int dp[][] = new int[x + 1][y + 1];
        for (int i = 0; i < x + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < y + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < x + 1; i++) {
            for (int j = 1; j < y + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[x][y];

    }
}
