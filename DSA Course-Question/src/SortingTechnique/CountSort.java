package SortingTechnique;

import java.util.Arrays;

public class CountSort {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 4, 4, 1, 0, 1 };
        int k = 5;
        int n = arr.length;
        System.out.println("After Naive Count Sort: ");
        countSortNaive(arr, n, k);
        System.out.println(Arrays.toString(arr));
        System.out.println("After General Purpose Implementation: ");
        generalPurposeCountSort(arr, n, k);
        System.out.println(Arrays.toString(arr));

    }

    static void countSortNaive(int arr[], int n, int k) {
        int count[] = new int[k];
        Arrays.fill(count, 0);
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    static void generalPurposeCountSort(int arr[], int n, int k) {
        int count[] = new int[k];
        Arrays.fill(count, 0);
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i];
        }
        int output[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
