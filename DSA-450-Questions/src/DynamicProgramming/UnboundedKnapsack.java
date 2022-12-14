package DynamicProgramming;

public class UnboundedKnapsack {
    public static void main(String args[]) {
        int val[] = new int[] { 15, 14, 10, 45, 30 };
        int wt[] = new int[] { 2, 5, 1, 3, 4 };
        int W = 7; // (Allowed Weight)
        System.out.println("The Unbounded Knapsack: " + unboundedKnapSack(val, wt, W));

    }

    // Tabulation Method

    static int unboundedKnapSack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i - 1] <= j) {
                    // Condition: Valid
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    // Condition: Invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

}
