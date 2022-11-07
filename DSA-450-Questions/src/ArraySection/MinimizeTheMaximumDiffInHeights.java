package ArraySection;

import java.util.Arrays;

public class MinimizeTheMaximumDiffInHeights {
    public static void main(String args[]) {
        int k = 2, arr[] = new int[] { 1, 5, 8, 10 };
        System.out.println("The Minimized Difference in Height: " + minimizeTheDifference(arr, k, arr.length));
    }

    static int minimizeTheDifference(int arr[], int k, int n) {
        if (n == 1) {
            return 0;
        }
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int min, max;
        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            min = Math.min(arr[i] - k, arr[0] + k);
            ans = Math.min(ans, max - min);
        }
        return ans;
    }
}
