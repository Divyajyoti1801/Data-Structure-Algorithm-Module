package DynamicProgrammingTwo;

public class BinomialCoefficient {
    public static void main(String args[]) {
        int n = 15;
        int r = 3;
        System.out.println("Binomial Coefficient: " + binomialCoefficient(n, r));
    }

    static int binomialCoefficient(int n, int r) {
        int mod = (int) Math.pow(10, 9) + 7;
        if (n < r) {
            return 0;
        } else if (n == r) {
            return 1;
        }
        int dp[][] = new int[n + 1][r + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < r + 1; j++) {
                if (i == j || i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % mod;
                }
            }
        }
        return dp[n][r];
    }

}
