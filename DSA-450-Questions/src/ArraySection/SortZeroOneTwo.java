package ArraySection;

import java.util.Arrays;

//Use of Algorithm: Dutch National Flag Algorithm
/*
 * Give N balls of color red, white or blue, arranged in a line order. You have to arrange all the balls such that the balls with the same colors are adjacent with the order of the balls, with the order of colors being red, white and blue.
 */

public class SortZeroOneTwo {
    public static void main(String args[]) {
        int arr[] = new int[] { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        System.out.println("The Sorted Colors: ");
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sortColors(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

}
