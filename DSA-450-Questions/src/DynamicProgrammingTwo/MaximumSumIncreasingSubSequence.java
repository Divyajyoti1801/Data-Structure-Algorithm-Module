package DynamicProgrammingTwo;

public class MaximumSumIncreasingSubSequence {
    public static void main(String args[]) {
        int n = 5;
        int arr[] = new int[] { 1, 101, 2, 3, 100 };
        System.out.println("Maximum Sum Increasing Sub Sequence: " + maxSumIncreasingSubSequence(arr, n));

    }
    
    static int maxSumIncreasingSubSequence(int arr[], int n) {
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }
        int j = 0, i = j + 1;
        int max = arr[j];
        while (i < n) {
            if (arr[j] < arr[i]) {
                dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                max = Math.max(max, dp[i]);
            }
            j++;
            if (i == j) {
                j = 0;
                i++;
            }
        }
        return max;
    }

}
