package DynamicProgrammingTwo;

import java.util.Arrays;

public class MaximumSumSubsequenceNoThree {
    public static void main(String args[]) {
        int arr[] = new int[] { 3000, 2000, 1000, 3, 10 };
        int n = arr.length;
        System.out.println("Maximum Sum SubSequence Not Consecutive 3 elements: " + solution(arr, n));
    }

    static int solution(int arr[], int n) {
        int dp[] = new int[1000];
        Arrays.fill(dp, -1);
        return process(arr, n, dp);
    }

    static int process(int arr[], int n, int dp[]) {
        if (dp[n] != -1) {
            return dp[n];
        }
        if (n == 0) {
            return dp[n] = 0;
        }
        if (n == 1) {
            return dp[n] = arr[0];
        }
        if (n == 2) {
            return dp[n] = arr[1] + arr[0];
        }
        return dp[n] = Math.max(Math.max(process(arr, n - 1, dp), process(arr, n - 2, dp) + arr[n]),
                arr[n] + arr[n - 1] + process(arr, n - 3, dp));
    }
}
