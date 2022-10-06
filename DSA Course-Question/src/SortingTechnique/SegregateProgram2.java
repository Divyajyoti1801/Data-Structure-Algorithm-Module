package SortingTechnique;

import java.util.Arrays;

public class SegregateProgram2 {
    public static void main(String args[]) {
        int arr[] = new int[] { 15, 14, 13, 12 };
        segregateEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregateEvenOdd(int arr[]) {
        int i = -1, j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] % 2 == 0);
            do {
                j--;
            } while (arr[j] % 2 != 0);
            if (i >= j)
                return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
