package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String args[]) {
        int n = 5;
        System.out.println("Climbing Stairs Problem: " + climbingStairs(n));
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Dynamic Programming(Memoization Code): " + climbingStairsTwo(n, dp));
        System.out.println("Dynamic Programming(Tabulation Code): " + climbingStairsThree(n));
    }

    // Normal Recursion
    static int climbingStairs(int n) {
        // Timing Complexity: O(2^n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }

    // DP: Top-Down Approach (Memoization)
    static int climbingStairsTwo(int n, int dp[]) {
        // Time Complexity: O(n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climbingStairsTwo(n - 1, dp) + climbingStairsTwo(n - 2, dp);
        return dp[n];
    }

    // DP: Bottom-Up Approach (Tabulation)
    static int climbingStairsThree(int n) {
        // Time complexity: O(n)
        // Step1: Create Table + Initialize(Base Case)
        // Step2: Meaning for Index (Virtual)
        // Step3: fill(small to large)
        int ways[] = new int[n + 1];
        ways[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ways[i] = ways[i - 1];
            } else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }

        return ways[n];

    }

}
