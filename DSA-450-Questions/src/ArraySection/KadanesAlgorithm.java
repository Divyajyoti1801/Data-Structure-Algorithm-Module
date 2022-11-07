package ArraySection;

public class KadanesAlgorithm {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, -2, 5 };
        System.out.println("Maximum sum of contiguous subarray: " + MaxSubarrayContinguousSum(arr, arr.length));
    }

    static int MaxSubarrayContinguousSum(int arr[], int n) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here += arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
