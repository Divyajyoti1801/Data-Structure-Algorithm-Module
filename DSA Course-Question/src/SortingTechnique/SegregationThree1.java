package SortingTechnique;

import java.util.Arrays;

public class SegregationThree1 {
    public static void main(String args[]) {
        int arr[] = new int[] { 0, 1, 0, 2, 1, 2 };
        DNFAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Dutch National Flag algorithm
    public static void DNFAlgo(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp1 = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp1;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}
