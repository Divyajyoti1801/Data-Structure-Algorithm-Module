package SearchingTechnique;

public class CountOneInSortedArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 0, 0, 1, 1, 1, 1, 1 };
        System.out.println("The Number of 1's in an Array: " + countOne(arr));

    }

    public static int countOne(int arr[]) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] == 0) {
                    return (arr.length - mid);
                } else {
                    high = mid - 1;
                }
            }
        }
        return 0;
    }
}
