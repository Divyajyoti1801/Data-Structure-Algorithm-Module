package Hashing;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 15, -5, 15, 10, 5 };
        int sum = 5;
        int start = 0, end = -1, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum - sum)) {
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if (end == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(start + " , " + end);
        }
        System.out.println("Have Sub-Array Sum: " + subArraySumFunc(arr, sum));
    }

    static boolean subArraySumFunc(int arr[], int sum) {
        int s = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            current += arr[i];
            while (sum < current) {
                current -= arr[s];
                s++;
            }
            if (current == sum) {
                return true;
            }
        }
        return false;
    }
}
