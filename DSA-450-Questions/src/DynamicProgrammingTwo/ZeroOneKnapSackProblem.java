package DynamicProgrammingTwo;

import java.util.*;

public class ZeroOneKnapSackProblem {
    public static void main(String args[]) {
        int values[] = { 1, 2, 3 };
        int weight[] = { 4, 5, 1 };
        int N = 3;
        int W = 4;
        // Memoization code preparation
        int memo[][] = new int[N + 1][W + 1];
        for (int arr[] : memo) {
            Arrays.fill(arr, -1);
        }
        System.out.println("(0-1) KnapSack Problem: " + KnapSackMemoization(values, weight, N, W, memo));
    }

    // Memoization Code
    static int KnapSackMemoization(int values[], int weight[], int N, int W, int memo[][]) {
        // Base Case
        if (N == 0 || W == 0) {
            return 0;
        }
        if (memo[N][W] != -1) {
            return memo[N][W];
        }
        if (weight[N - 1] <= W) {
            // Include
            int ans1 = values[N - 1] + KnapSackMemoization(values, weight, N - 1, W - weight[N - 1], memo);
            // Exclude;
            int ans2 = KnapSackMemoization(values, weight, N - 1, W, memo);
            memo[N][W] = Math.max(ans1, ans2);
            return memo[N][W];
        } else {
            // Invalid Situation
            memo[N][W] = KnapSackMemoization(values, weight, N - 1, W, memo);
            return memo[N][W];
        }
    }

    // Tabulation Code
}
