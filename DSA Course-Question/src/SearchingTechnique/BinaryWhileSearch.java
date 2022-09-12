package SearchingTechnique;

public class BinaryWhileSearch {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 20, 30, 40, 50, 60 };
        System.out.println("Binary Search with while loop: " + binaryWhileSearch(arr, 20));

    }

    public static int binaryWhileSearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
