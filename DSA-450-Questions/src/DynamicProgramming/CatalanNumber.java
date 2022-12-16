package DynamicProgramming;

import java.util.*;

public class CatalanNumber {
    public static void main(String args[]) {
        int n = 4;
        System.out.println("Catalan's Number(Recursion): " + catalanNumber(n));
        // 2. Memoization
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println("Catalan's Number(Memoization): " + catalanNumberMemoization(n, memo));
        // 3. Tabulation
        System.out.println("Catalan's Number(Tabulation): " + catalanNumberTabulation(n));
    }
    // Catalan's Number Concept
    // Cn = Cn.Cn-1 + C1.Cn-2 + C2.Cn-3 + ........ + Cn-1C0

    // Method-1: Recursion
    static int catalanNumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanNumber(i) * catalanNumber(n - i - 1);
        }
        return ans;
    }

    // Method-2: Memoization
    static int catalanNumberMemoization(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanNumberMemoization(i, memo) * catalanNumberMemoization(n - i - 1, memo);
        }
        return memo[n] = ans;
    }

    // Method-3: Tabulation
    static int catalanNumberTabulation(int n) {
        int dp[] = new int[n + 1];
        // Initialization
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j <= i - 1; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];

    }
}
