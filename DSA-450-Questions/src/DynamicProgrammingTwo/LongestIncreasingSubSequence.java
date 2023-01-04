package DynamicProgrammingTwo;

import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubSequence {
    public static void main(String args[]) {
        int size = 16;
        int a[] = new int[] { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println("The longest increasing Subsequence: " + longestIncreasingSequence(size, a));
    }

    static int longestIncreasingSequence(int size, int a[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        int arr2[] = new int[set.size()];
        int i = 0;
        for (int s : set) {
            arr2[i] = s;
            i++;
        }
        Arrays.sort(arr2);

        return LCS(a, arr2);
    }

    static int LCS(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }
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
