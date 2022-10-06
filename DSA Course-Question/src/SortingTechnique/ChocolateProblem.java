package SortingTechnique;

import java.util.Arrays;

public class ChocolateProblem {
    public static void main(String args[]) {
        int arr[] = new int[] { 7, 3, 1, 8, 9, 12, 56 };
        System.out.println("Chocolate Problem result: " + chocolateProblem(arr, 3));

    }

    public static int chocolateProblem(int arr[], int m) {
        if (m > arr.length) {
            return -1; // entered range must be smaller than lenght of array
        }
        Arrays.sort(arr);
        int res = arr[m - 1] - arr[0]; // let's say m=3, arr.length=7 //arr[2]-arr[0] result of first batch stored in
                                       // res
        for (int i = 1; (i + m - 1) < arr.length; i++) {
            res = Math.min(res, arr[i + m - 1] - arr[i]);
        }
        return res;

    }
}
