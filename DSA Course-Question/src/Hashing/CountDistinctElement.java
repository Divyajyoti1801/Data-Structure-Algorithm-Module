package Hashing;

import java.util.*;

public class CountDistinctElement {
    public static void main(String args[]) {
        int arr[] = new int[] { 5, 10, 5, 4, 5, 10 };
        HashSet<Integer> distinct = new HashSet<>();
        for (int a : arr) {
            distinct.add(a);
        }
        System.out.println(distinct);
        System.out.println("Number of Distinct element: " + distinct.size());
        RemoveDuplicates(arr);
    }

    // Another Method to remove duplicates
    public static void RemoveDuplicates(int arr[]) {
        Arrays.sort(arr);
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        System.out.println("The Distinct Element: ");
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
