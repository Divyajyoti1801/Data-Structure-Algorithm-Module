package DynamicProgramming;

import java.util.*;

public class RodCutting {
    public static void main(String args[]) {
        int length[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;
        System.out.println("The Rod Cutting Problem: " + rodCutting(length, price, rodLength));
    }

    // Tabulation Method
    public static int rodCutting(int length[], int price[], int rodLength) {
        int n = price.length;
        int dp[][] = new int[n + 1][rodLength + 1];
        for (int i[] : dp) {
            Arrays.fill(i, 0);
        }
        for (int j = 0; j < rodLength + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i - 1][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][rodLength];
    }
}
