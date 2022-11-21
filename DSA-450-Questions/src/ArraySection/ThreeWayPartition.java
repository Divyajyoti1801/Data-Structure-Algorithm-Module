package ArraySection;

import java.util.*;

public class ThreeWayPartition {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 3, 4 };
        int r[] = new int[] { 1, 2 };
        threeWayPartition(arr, r);
        System.out.println(Arrays.toString(arr));
    }

    static void threeWayPartition(int arr[], int r[]) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i <= right; i++) {
            if (arr[i] < r[0]) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            } else if (arr[i] > r[1]) {
                int temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                right--;
                i--;
            }
        }
    }
}
