package DynamicProgramming;

public class WildcardMatching {
    public static void main(String args[]) {
        String str = "abc";
        String pattern = "**d";
        System.out.println("Wild Card Matching: " + wildCardMatching(str, pattern));
    }

    static boolean wildCardMatching(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();
        // By default boolean array initialized with false
        boolean dp[][] = new boolean[n + 1][m + 1];
        // Initialization of DP Matrix
        dp[0][0] = true;
        // pattern= " ";
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        // String=" "
        for (int j = 1; j < m + 1; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        // Bottom Up Approach
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str.charAt(i - 1) == pattern.charAt(j - 1) || (pattern.charAt(j - 1) == '?')) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
}
