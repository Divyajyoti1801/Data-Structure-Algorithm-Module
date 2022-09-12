package SearchingTechnique;

public class TripletInSortedArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 2, 5, 10, 15, 18 };
        System.out.println("Triplet in Sorted Array(Naive): " + tripletInSortedArray(arr, 33));

    }

    public static boolean pair(int arr[], int x, int si) {
        int low = si, high = arr.length - 1;
        while (low < high) {
            int ops = arr[low] + arr[high];
            if (ops == x) {
                return true;
            }
            if (ops > x) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }

    public static boolean tripletInSortedArray(int arr[], int x) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (pair(arr, x - arr[i], i + 1)) {
                return true;
            }
        }
        return false;
    }

}
