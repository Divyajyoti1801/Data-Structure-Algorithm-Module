package DynamicProgrammingTwo;

import java.util.Arrays;

public class PaintingTheFence {
    public static void main(String args[]) {
        int n = 3, k = 2;
        long dp[] = new long[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Number of Ways Painting the fence: " + paintingFenceMemoization(n, k, dp));

    }

    static long mods = (long) (Math.pow(10, 9) + 7);

    static long paintingFenceMemoization(int n, int k, long dp[]) {
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return k * k;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        long same = (paintingFenceMemoization(n - 2, k, dp) * (k - 1)) % mods;
        long diff = (paintingFenceMemoization(n - 1, k, dp) * (k - 1)) % mods;
        return dp[n] = (same + diff) % mods;

    }

}
