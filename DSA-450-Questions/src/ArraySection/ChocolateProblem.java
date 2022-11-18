package ArraySection;

import java.util.Arrays;

public class ChocolateProblem {
    public static void main(String args[]) {
        int[] arr = new int[] { 3, 4, 1, 9, 56, 7, 9, 12 };
        int M = 5;
        System.out.println("The Minimum Difference in Chocolate: " + findMinDiff(arr, M));

    }

    static int findMinDiff(int arr[], int M) {
        int i = 0;
        int j = M - 1;
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        while (j < arr.length) {
            min_diff = Math.min(min_diff, arr[j] - arr[i]);
            i++;
            j++;
        }
        return min_diff;
    }
}
