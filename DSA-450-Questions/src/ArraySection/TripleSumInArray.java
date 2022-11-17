package ArraySection;

import java.util.*;

public class TripleSumInArray {
    public static void main(String args[]) {
        int[] arr = new int[] { 1, 4, 45, 6, 10, 8 };
        int sum = 13;
        System.out.println("Is triplet sum available: " + tripletSumInArray(arr, sum));
    }

    static boolean tripletSumInArray(int arr[], int sum) {
        int l, r;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            l = i + 1;
            r = arr.length - 1;
            while (l < r) {
                int present_sum = arr[i] + arr[l] + arr[r];
                if (present_sum == sum) {
                    return true;
                } else if (present_sum < sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }
}
