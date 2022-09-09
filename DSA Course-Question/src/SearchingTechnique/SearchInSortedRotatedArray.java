package SearchingTechnique;

public class SearchInSortedRotatedArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 100, 200, 400, 1000, 10, 20 };
        System.out.println("Searching Element(Naive): " + searchInSortedRotatedArrayNaive(arr, 20));
        System.out.println("Searching Element(Efficient) " + searchInSortedRotatedArrayEfficient(arr, 200));
    }

    public static int searchInSortedRotatedArrayNaive(int arr[], int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return i;
            }
        }
        return -1;
    }

    public static int searchInSortedRotatedArrayEfficient(int arr[], int s) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == s) {
                return mid;
            }
            if (arr[low] < arr[mid]) {
                if (s >= arr[low] && s < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (s > arr[mid] && s <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
