package DynamicProgrammingTwo;

import java.util.Arrays;

public class MaximizingCutSegment {
    public static void main(String args[]) {
        int n = 4;
        int x = 2, y = 1, z = 1;
        System.out.println("The Solution of Maximizing Cuts: " + MaximizeCut(n, x, y, z));

    }

    static int MaximizeCut(int n, int x, int y, int z) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        int result = maximizeCutsHelper(n, x, y, z, dp);
        if (result < 0) {
            return 0;
        }
        return result;
    }

    static int maximizeCutsHelper(int n, int x, int y, int z, int dp[]) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        if (n - x >= 0) {
            one = maximizeCutsHelper(n - x, x, y, z, dp);
        }
        if (n - y >= 0) {
            two = maximizeCutsHelper(n - y, x, y, z, dp);
        }
        if (n - z >= 0) {
            three = maximizeCutsHelper(n - z, x, y, z, dp);
        }
        return dp[n] = 1 + Math.max(one, Math.max(two, three));
    }
}
