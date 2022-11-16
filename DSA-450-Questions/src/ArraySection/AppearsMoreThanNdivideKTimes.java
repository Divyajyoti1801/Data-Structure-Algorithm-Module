package ArraySection;

import java.util.*;

public class AppearsMoreThanNdivideKTimes {
    public static void main(String args[]) {
        int arr[] = new int[] { 9, 8, 7, 9, 2, 9, 7 };
        int k = 3;
        System.out.println("Elements Appear More Than N/k times: ");
        ArrayList<Integer> R = appearsMoreThanNdivideKTimes(arr, k);
        for (int r : R) {
            System.out.print(r + " ");
        }
        System.out.println();

    }

    static ArrayList<Integer> appearsMoreThanNdivideKTimes(int arr[], int k) {
        int check = (arr.length / k);
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        int i = 1;
        int count = 1;
        while (i < arr.length) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > check) {
                    result.add(arr[i - 1]);
                }
                count = 1;
            }
            i++;
        }
        if (count > check) {
            result.add(arr[i - 1]);
        }
        return result;

    }
}
