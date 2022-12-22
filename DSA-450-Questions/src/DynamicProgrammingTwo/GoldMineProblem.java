package DynamicProgrammingTwo;

import java.util.Arrays;

public class GoldMineProblem {
    public static void main(String args[]) {
        int[][] gold = new int[][] { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };
        int n = 4, m = 4;
        System.out.println("Gold Mine Problem (Recursion): " + maxGoldCollected(gold, n, m));
        System.out.println("Gold Mine Problem (Memoization): " + maxGoldCollected2(gold, n, m));

    }

    // Recursion Method:
    static int GoldCollection(int gold[][], int x, int y, int n, int m) {
        if ((x < 0) || (x == n) || (y == m)) {
            return 0;
        }
        int rud = GoldCollection(gold, x - 1, y + 1, n, m);
        int right = GoldCollection(gold, x, y + 1, n, m);
        int rld = GoldCollection(gold, x + 1, y + 1, n, m);
        return gold[x][y] + Math.max(Math.max(rud, rld), right);
    }

    static int maxGoldCollected(int[][] gold, int n, int m) {
        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            int goldCollected = GoldCollection(gold, i, 0, n, m);
            maxGold = Math.max(maxGold, goldCollected);
        }
        return maxGold;
    }

    // Memoization Method
    static int GoldCollectionMemoization(int gold[][], int x, int y, int n, int m, int dp[][]) {
        if (x < 0 || x == n || y == m) {
            return 0;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        int rud = GoldCollectionMemoization(gold, x - 1, y + 1, n, m, dp);
        int right = GoldCollectionMemoization(gold, x, y + 1, n, m, dp);
        int rld = GoldCollectionMemoization(gold, x + 1, y + 1, n, m, dp);

        return dp[x][y] = gold[x][y] + Math.max(Math.max(right, rld), rud);
    }

    static int maxGoldCollected2(int[][] gold, int n, int m) {
        int maxGold = 0;
        int dp[][] = new int[n][m];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        for (int i = 0; i < n; i++) {
            int goldCollected = GoldCollectionMemoization(gold, i, 0, n, m, dp);
            maxGold = Math.max(maxGold, goldCollected);
        }
        return maxGold;
    }
}
