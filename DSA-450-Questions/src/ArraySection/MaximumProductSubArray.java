package ArraySection;

public class MaximumProductSubArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 6, -3, -10, 0, 2 };
        System.out.println("The Product in Sub-Array: " + maxProductSubArray(arr));
    }

    static long maxProductSubArray(int arr[]) {
        int max_ending_here = arr[0];
        int min_ending_here = arr[0];
        int max_so_far = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(Math.max(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);

            min_ending_here = Math.min(Math.min(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);

            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

}
