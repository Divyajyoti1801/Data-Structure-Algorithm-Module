package Hashing;

import java.util.*;

public class EquivBinaryArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 1, 0, 1, 1, 0, 0 };
        int start = 0, end = -1, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (map.containsKey(currSum)) {
                start = map.get(currSum) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
            if (end == -1) {
                System.out.println("Not Found");
            } else {
                System.out.println(start + " " + end);
            }
        }

    }
}
