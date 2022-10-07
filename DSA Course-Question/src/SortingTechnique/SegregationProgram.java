package SortingTechnique;

import java.util.Arrays;

public class SegregationProgram {
    public static void main(String args[]) {
        int arr[] = new int[] { 15, -3, -2, 18 };
        segregatedArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void segregatedArray(int arr[]) {
        int i = -1, j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] >= 0);
            if (i >= j)
                return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
