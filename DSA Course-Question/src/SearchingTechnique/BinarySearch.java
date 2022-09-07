package SearchingTechnique;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 20, 30, 40, 50, 60 };
        // The Only Condition that array most be sorted in increasing order or prior
        // Sorting is needed
        System.out.println("The Position of element: " + binarySearch(arr, 20));
        System.out.println("The Position of element(Recursive): " + binarySearchRecursive(arr, 0, arr.length - 1, 200));

    }

    public static int binarySearch(int arr[], int element) {
        int pos = -1;
        int mid = (arr.length - 1) / 2;
        if (element <= arr[mid]) {
            for (int i = 0; i <= mid; i++) {
                if (element == arr[i]) {
                    pos = i;
                    return i;
                }
            }
        } else if (element > arr[mid]) {
            for (int i = mid + 1; i < arr.length; i++) {
                if (element == arr[i]) {
                    pos = i;
                    return i;
                }
            }
        }
        return pos;
    }

    public static int binarySearchRecursive(int arr[], int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearchRecursive(arr, low, mid - 1, x);
        } else if (arr[mid] < x) {
            return binarySearchRecursive(arr, mid + 1, high, x);
        }
        return -1;
    }

}
