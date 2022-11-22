package ArraySection;

public class MinimumSwapsKtogether {
    public static void main(String args[]) {
        int arr[] = new int[] { 2, 1, 5, 6, 3 };
        int k = 3;
        System.out.println("Minimum Number of Swaps required to make a subarray: " + minSwapsforK(arr, k));

    }

    public static int minSwapsforK(int arr[], int k) {
        int window = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                window++;
            }
        }
        int i = 0;
        int ele = 0;
        while (i < window) {
            if (arr[i] <= k) {
                ele++;
            }
            i++;
        }
        int ans = window - ele;
        while (i < arr.length) {
            if (arr[i - window] <= k) {
                ele--;
            }
            if (arr[i] <= k) {
                ele++;
            }
            ans = Math.min(ans, window - ele);
            i++;
        }
        return ans;

    }

}
