package DynamicProgrammingTwo;

public class EggProblem {
    public static void main(String args[]) {
        int n = 4;
        int k = 3;
        System.out.println("Egg Problem: " + solve(n, k));

    }

    static int solve(int n, int k) {
        int dp[][] = new int[201][201];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = -1;
            }
        }
        return process(n, k, dp);
    }

    static int process(int n, int k, int dp[][]) {
        if (dp[n][k] != -1) {
            return dp[n][k];
        }
        if (k == 0 || k == 1) {
            return k;
        }
        if (n == 1) {
            return k;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            ans = Math.min(ans, 1 + Math.max(process(n - 1, i - 1, dp), process(n, k - i, dp)));
        }
        return dp[n][k] = ans;
    }

}
