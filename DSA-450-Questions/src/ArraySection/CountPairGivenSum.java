package ArraySection;

import java.util.HashMap;
import java.util.Map;

public class CountPairGivenSum {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 5, 7, 1 };
        System.out.println("Get Pair for given sum: " + getPairCount(arr, 6));
    }

    static int getPairCount(int arr[], int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 0);
            }
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println();

        int twice_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(sum - arr[i]) != null) {
                twice_count += hm.get(sum - arr[i]);
            }
            if (sum - arr[i] == arr[i]) {
                twice_count--;
            }
        }
        return twice_count / 2;

    }
}
