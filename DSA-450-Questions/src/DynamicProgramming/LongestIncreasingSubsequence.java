package DynamicProgramming;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String args[]) {
        int arr[] = new int[] { 50, 3, 10, 7, 40, 80 };
        System.out.println("Length of Longest Common subsequence: " + LIS(arr));
    }

    static int LIS(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int arr2[] = new int[set.size()]; // sorted unique elements.
        int i = 0;
        for (int n : set) {
            arr2[i] = n;
            i++;
        }
        Arrays.sort(arr2);
        return LCS(arr, arr2);
    }

    static int LCS(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        // 1. Initialization
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }
        // Bottom up approach
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];

    }
}
