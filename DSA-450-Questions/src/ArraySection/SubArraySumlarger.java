package ArraySection;

public class SubArraySumlarger {
    public static void main(String args[]) {
        int arr[] = new int[] { 6, 3, 4, 5, 4, 3, 7, 9 };
        int sum = 16;
        System.out.println("The minimum length of Sub Array whose sum is greater than given sum: "
                + subArraySumLargerThanGiven(arr, sum));

    }

    static int subArraySumLargerThanGiven(int arr[], int sum) {
        int start = 0;
        int result_sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length; i++) {
            while (result_sum > sum && start < i) {
                ans = Math.min(ans, i - start);
                result_sum -= arr[start++];
            }
            if (i < arr.length) {
                result_sum += arr[i];
            }
        }
        return ans;
    }

}
