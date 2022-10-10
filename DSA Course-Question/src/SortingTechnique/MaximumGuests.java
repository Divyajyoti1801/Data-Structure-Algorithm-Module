package SortingTechnique;

import java.util.Arrays;

public class MaximumGuests {
    public static void main(String args[]) {
        int arr[] = new int[] { 900, 940 };
        int dep[] = new int[] { 1000, 1030 };
        System.out.println("Meet Maximum Guest: " + meetMaximumGuest(arr, dep));
    }

    public static int meetMaximumGuest(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0, res = 1, curr = 1;
        while (i < arr.length && j < arr.length) {
            if (arr[i] <= dep[i]) {
                curr++;
                i++;
            } else {
                curr--;
                j++;
            }
            res = Math.max(res, curr);
        }
        return res;
    }
}
