package SortingTechnique;

import java.util.Arrays;

public class QuickSortWithHoarePatition {
    public static void main(String args[]) {
        int arr[] = new int[] { 8, 4, 7, 9, 3, 10, 5 };
        quikSortHoare(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quikSortHoare(int arr[], int low, int high) {
        if (low < high) {
            int p = HoarePartition(arr, low, high);
            quikSortHoare(arr, low, p); // This the change in implementation
            quikSortHoare(arr, p + 1, high);
        }
    }

    public static int HoarePartition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
