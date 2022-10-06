package SortingTechnique;

import java.util.Arrays;

public class SegregateProgram3 {
    public static void main(String args[]) {
        int arr[] = new int[] { 0, 1, 1, 1, 0, 0, 0 };
        segregateBinary(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregateBinary(int arr[]) {
        int i = -1, j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] == 0);
            do {
                j--;
            } while (arr[j] != 0);
            if (i >= j) {
                return;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
