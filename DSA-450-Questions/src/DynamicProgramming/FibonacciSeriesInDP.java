package DynamicProgramming;

public class FibonacciSeriesInDP {
    public static void main(String[] args) {
        // The recurrence relationship of fibonacci series.
        // Fib(n)=Fib(n-1) + Fib(n-2)
        int n = 5;
        int f[] = new int[n + 1];
        System.out.println("Fibonacci of n(Memoization): " + fibonacciSeries(n, f));
        System.out.println("Fibonacci of n(Tabular): " + fibonacciSeriesTwo(n));

    }

    // DP-Memoization Approach(Top-Down Approach)
    static int fibonacciSeries(int n, int[] f) {
        // In this recursion tree it become skewed tree.
        // This process is called memoization.
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            // if this is the case then is fibonacci of n is already calculated
            return f[n];
        }

        f[n] = fibonacciSeries(n - 1, f) + fibonacciSeries(n - 2, f);
        return f[n];
    }

    // DP-Tabulation Approach(Bottom-Up Approach)
    static int fibonacciSeriesTwo(int n) {
        int dp[] = new int[n + 1];
        // Initializing the recursive Base Case
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
