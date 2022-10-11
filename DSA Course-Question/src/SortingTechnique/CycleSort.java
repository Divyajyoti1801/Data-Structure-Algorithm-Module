package SortingTechnique;

import java.util.Arrays;

public class CycleSort {
    public static void main(String args[]) {
        int arr[] = new int[] { 20, 40, 50, 10, 30 };
        cycleSortDistinct(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSortDistinct(int arr[]) {
        for (int cs = 0; cs < arr.length - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < arr.length; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }
            // SwapFunc.swapFunc(item, arr[pos]);
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;
            while (pos != cs) {
                pos = cs;
                for (int j = cs + 1; j < arr.length; j++) {
                    if (arr[j] < item) {
                        pos++;
                    }
                }
                int temp2 = item;
                item = arr[pos];
                arr[pos] = temp2;
                // SwapFunc.swapFunc(item, arr[pos]);
            }
        }
    }
}
