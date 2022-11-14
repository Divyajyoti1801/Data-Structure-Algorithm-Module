package ArraySection;

import java.util.*;

public class AlternateNegativePositive {
    public static void main(String args[]) {
        int arr[] = new int[] { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        arr = alternateNegativePositive(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] alternateNegativePositive(int arr[]) {
        int neg_length = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg_length++;
            }
        }
        int pos_idx = neg_length;
        if (neg_length >= 1) {
            for (int i = 1; i <= neg_length; i += 2) {
                int temp = arr[i];
                arr[i] = arr[pos_idx];
                arr[pos_idx] = temp;
                pos_idx++;
            }
        }
        return arr;

    }
}
