package DynamicProgrammingTwo;

public class SubSequencesProductlessK {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        int k = 10;

        System.out.println("Sub sequence product less than K: " + find(arr, arr.length, k));
    }

    static int find(int arr[], int n, int k) {
        int dp[][] = new int[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int product = 1;
        return process(arr, n, k, product, dp);
    }

    static int process(int arr[], int n, int k, int product, int dp[][]) {
        if (n == 0) {
            return 0;
        }
        if (product > k) {
            return 0;
        }
        if (dp[n][product] != -1) {
            return dp[n][product];
        }
        int inc = product * arr[n - 1];
        int exc = product;
        int count = 0;
        if (inc < k) {
            count++;
        }
        count += process(arr, n - 1, k, inc, dp) + process(arr, n - 1, k, exc, dp);
        dp[n][product] = count;
        return dp[n][product];
    }
}
