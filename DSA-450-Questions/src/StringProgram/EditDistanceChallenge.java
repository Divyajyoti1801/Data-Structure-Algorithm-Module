package StringProgram;

public class EditDistanceChallenge {
    public static void main(String args[]) {
        String s = "geek";
        String t = "geeks";
        System.out.println("Edit Distance Result: " + editDistance(s, t));

    }

    static int editDistance(String s, String t) {

        // 1. Operation: Insert a character in any position
        // 2. Operation: Remove any character from String
        // 3. Operation: Replace any character form the String with any other character
        // We will use dynamic programming
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Adding
                    int ans1 = dp[i][j - 1] + 1;
                    // Removing
                    int ans2 = dp[i - 1][j] + 1;
                    // Replacing
                    int ans3 = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(ans1, Math.min(ans2, ans3));
                }
            }
        }
        return dp[n][m];
    }
}
