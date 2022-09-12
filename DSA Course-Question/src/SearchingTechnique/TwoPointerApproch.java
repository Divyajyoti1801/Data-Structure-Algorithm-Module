package SearchingTechnique;

public class TwoPointerApproch {
    public static void main(String args[]) {
        int arr[] = new int[] { 3, 8, 13, 18 };
        // Sorted Array is necessary
        System.out.println("Two Pointer Approch (Naive): " + twoPointerApprochN(arr, 14));
    }

    public static boolean twoPointerApprochN(int arr[], int sum) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int ops = arr[low] + arr[high];
            if (ops == sum) {
                return true;
            }
            if (ops > sum) {
                high--;
            }
            if (ops < sum) {
                low++;
            }
        }

        return false;
    }

}
