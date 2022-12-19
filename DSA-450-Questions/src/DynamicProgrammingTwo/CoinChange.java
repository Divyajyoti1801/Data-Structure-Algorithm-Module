package DynamicProgrammingTwo;

import java.util.Arrays;

public class CoinChange {
    public static void main(String args[]) {
        int sum = 4;
        int coin[] = new int[] { 1, 2, 3 };
        // Concept Used Unbounded Knapsack
        System.out.println("Coin Change Solutions: " + coinChange(sum, coin));
    }

    // Memoization Code
    static long coinChange(int sum, int coin[]) {
        int n = coin.length;
        long[][] dp = new long[n + 1][sum + 1];
        for (long arr[] : dp) {
            Arrays.fill(arr, -1);
        }

        return memoization(sum, n - 1, coin, dp);
    }

    static long memoization(int sum, int n, int coin[], long dp[][]) {
        if (n == 0) {
            if (sum % coin[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[n][sum] != -1) {
            return dp[n][sum];
        }

        long noTake = memoization(sum, n - 1, coin, dp);
        long take = 0;
        if (coin[n] <= sum) {
            take = memoization(sum - coin[n], n, coin, dp);
        }
        return dp[n][sum] = take + noTake;
    }
}
