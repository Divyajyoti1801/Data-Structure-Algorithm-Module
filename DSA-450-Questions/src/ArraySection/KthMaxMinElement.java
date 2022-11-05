package ArraySection;

import java.util.Arrays;

public class KthMaxMinElement {
    public static void main(String args[]) {
        int arr[] = new int[] { 7, 10, 4, 3, 20, 15 };
        System.out.println("The Kth Smallest Element: " + kthMinimumElement(arr, 3));
        System.out.println("The Kth maximum Element: " + kthMaximumElement(arr, 4));
    }

    static int kthMinimumElement(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    static int kthMaximumElement(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
