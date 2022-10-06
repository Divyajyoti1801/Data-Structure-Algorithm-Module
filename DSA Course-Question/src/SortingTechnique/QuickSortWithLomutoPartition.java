package SortingTechnique;

import java.util.Arrays;

public class QuickSortWithLomutoPartition {
    public static void main(String args[]) {
        int arr[] = new int[] { 8, 4, 7, 9, 3, 10, 5 };
        quikSortLomuto(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quikSortLomuto(int arr[], int low, int high) {
        if (low < high) {
            int p = LomutoPartition(arr, low, high);
            quikSortLomuto(arr, low, p - 1);
            quikSortLomuto(arr, p + 1, high);
        }
    }

    public static int LomutoPartition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }
}
