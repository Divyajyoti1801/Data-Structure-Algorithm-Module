package ArraySection;

import java.util.*;

public class SubarrayWithZeroSum {
    public static void main(String args[]) {
        int arr[] = new int[] { 4, 2, -3, 1, 6 };
        System.out.println("The subarray with sum 0 exists: " + subArrayWithZeroSum(arr));
    }

    static boolean subArrayWithZeroSum(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(sum, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                return true;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return false;
    }
}
