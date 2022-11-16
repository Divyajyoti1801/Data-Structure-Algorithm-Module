package ArraySection;

import java.util.*;

public class LongestConsecutiveSubsequence {
    public static void main(String args[]) {
        int arr[] = new int[] { 100, 4, 200, 1, 3, 2 };
        System.out.println("Maximum Consecutive SubArray: " + longestConsecutiveSubsequence(arr));
        SortedSet<Integer> arr_set = new TreeSet<>();
        for (int i : arr) {
            arr_set.add(i);
        }
        for (int i : arr_set) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static int longestConsecutiveSubsequence(int arr[]) {
        SortedSet<Integer> arr1 = new TreeSet<>();
        for (int i : arr) {
            arr1.add(i);
        }
        int max = 0;
        int count = 0;
        int count1 = 0;
        int prev = 0;
        for (int i : arr1) {
            if (count == 0 || i - prev == 1) {
                count1++;
            } else {
                if (max < count1) {
                    max = count1;
                }
                count1 = 1;
            }
            prev = i;
            count++;
        }
        if (max < count1) {
            max = count1;
        }
        return max;
    }
}
