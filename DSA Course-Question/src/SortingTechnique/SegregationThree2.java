package SortingTechnique;

import java.util.Arrays;

public class SegregationThree2 {
    public static void main(String args[]) {
        int arr[] = new int[] { 2, 1, 2, 20, 10, 20, 1 };
        // SegregationNaive(arr, 2);
        DNFAlgoPivot(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void SegregationNaive(int arr[], int pivot) {
        // My Logic used Hoar's Algorithm of partition
        int i = -1, j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] <= pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void DNFAlgoPivot(int arr[], int pivot) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] < pivot) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                int temp2 = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp2;
                high--;
            }
        }
    }
}
