package SortingTechnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String args[]) {
        int arr[][] = new int[][] { { 1, 3 }, { 2, 4 }, { 5, 7 }, { 6, 8 } };
        // for (int a[] : arr) {
        // for (int i : a) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
        int temp[][] = mergeOverlapping(arr);
        for (int t[] : temp) {
            for (int i : t) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static int[][] mergeOverlapping(int arr[][]) {
        List<int[]> res = new ArrayList<>();
        if (arr.length == 0 || arr == null) {
            return res.toArray(new int[0][]);
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int start = arr[0][0];
        int end = arr[0][1];
        for (int[] i : arr) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                res.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[0][]);

    }

}
