package DynamicProgramming;

import java.util.*;

/**
 * Types of KnapSack Problems
 * 1. Fractional Knapsack (Greedy)
 * 2. 0-1 Knapsack
 * 3. Unbounded Knapsack
 */

public class KnapSack {
    public static void main(String args[]) {
        int val[] = new int[] { 15, 14, 10, 45, 30 };
        int wt[] = new int[] { 2, 5, 1, 3, 4 };
        // result should be max profit acquisition
        int W = 7;
        System.out.println("KnapSack(0-1) recursion solution: " + recursionKnapSack(val, wt, W, wt.length));
        // Dynamic Programming (Memoization)
        int dp[][] = new int[val.length + 1][W + 1];
        // Initializing dp matrix by -1
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        System.out.println("KnapSack(0-1) memoization solution: " + memoizationKnapSack(val, wt, W, wt.length, dp));
        // Dynamic Programming (Tabulation Matrix)
        System.out.println("KnapSack(0-1) tabulation solution: " + tabulationKnapSack(val, wt, W));

    }

    // Recursion Code:
    static int recursionKnapSack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            // Validate Situation
            int ans1 = val[n - 1] + recursionKnapSack(val, wt, W - wt[n - 1], n - 1);
            // Included in the bag
            int ans2 = recursionKnapSack(val, wt, W, n - 1);
            // Not Included in the bag
            return Math.max(ans1, ans2);
        } else {
            // Invalid Situation
            return recursionKnapSack(val, wt, W, n - 1);
        }
    }

    // Memoization Code: Time Complexity:O(n*W)
    static int memoizationKnapSack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            // Validate Situation
            int ans1 = val[n - 1] + memoizationKnapSack(val, wt, W - wt[n - 1], n - 1, dp);
            // Included in the bag
            int ans2 = memoizationKnapSack(val, wt, W, n - 1, dp);
            // Not Included in the bag
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            // Invalid Situation
            dp[n][W] = memoizationKnapSack(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    // Tabulation Method:
    static int tabulationKnapSack(int val[], int wt[], int W) {
        // W=0 and i=0 profit=0
        // j= knapsack size
        // i= represent value of items
        // i-items + j=W
        // 1. Create Table
        // 2. Assign Meaning to index + initialize the base case
        // 3. fill from bottom-up small to large.
        int n = val.length;
        int dp2[][] = new int[n + 1][W + 1];
        // Initialization of 0th col
        for (int i = 0; i < dp2.length; i++) {
            dp2[i][0] = 0;
        }
        // Initialization of 0th row
        for (int j = 0; j < dp2[0].length; j++) {
            dp2[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1]; // ith item value
                int w = wt[i - 1]; // ith item weight
                if (w <= j) {
                    // Valid condition
                    // Include profit
                    int incProfit = v + dp2[i - 1][j - w];
                    // Exclude profit
                    int excProfit = dp2[i - 1][j];
                    dp2[i][j] = Math.max(incProfit, excProfit);
                } else {
                    dp2[i][j] = dp2[i - 1][j];
                }
            }
        }
        printDynamicProgrammingTable(dp2);
        return dp2[n][W];
    }

    static void printDynamicProgrammingTable(int arr[][]) {
        System.out.println("Dynamic Programming Matrix: ");
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 0-1 Knapsack Problem: Fridge, laptop, book(The items which cannot be stored
    // in fraction.)
    // 0: item not got in bag
    // 1: item got in bag
    // Item repetition is not allowed

    // Unbounded Knapsack Problem: Same as 0-1 Knapsack but repetition of item
    // allowed.

}
