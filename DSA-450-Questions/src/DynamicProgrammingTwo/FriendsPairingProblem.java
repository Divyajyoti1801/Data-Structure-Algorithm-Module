package DynamicProgrammingTwo;

import java.util.Arrays;

public class FriendsPairingProblem {
    public static void main(String args[]) {
        int n = 3;
        System.out.println("Friends Pairing Problem(Recursion): " + friendPairProblem(n));
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Friends Pairing Problem(Memoization): " + friendPairProblemMemo(n, dp));
        System.out.println("Friends Pairing Problem(Tabulation): " + friendPairProblemTabulation(n));
    }

    // Recursion Method
    static long friendPairProblem(int n) {
        long mod = (long) Math.pow(10, 9) + 7;
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        long singlePair = friendPairProblem(n - 1);
        long pairValue = (n - 1) * friendPairProblem(n - 2);
        return (singlePair + pairValue) % mod;
    }

    // Memoization Method
    static long friendPairProblemMemo(int n, long[] dp) {
        long mod = (long) Math.pow(10, 9) + 7;
        if (dp[n] != -1) {
            return dp[n];
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        long singlePair = friendPairProblemMemo(n - 1, dp);
        long pairValue = (n - 1) * friendPairProblemMemo(n - 2, dp);
        return dp[n] = (singlePair + pairValue) % mod;
    }

    // Tabulation Method
    static long friendPairProblemTabulation(int n) {
        long mod = (long) Math.pow(10, 9) + 7;
        if (n == 1 || n == 2) {
            return n;
        }
        long dp[] = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[3] = (dp[2] + ((i - 1) * dp[1] % mod)) % mod;
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];

    }
}
