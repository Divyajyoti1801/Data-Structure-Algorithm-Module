package ArraySection;

import java.util.*;

public class ArraySubsetOfAnotherArray {
    public static void main(String args[]) {
        long arr1[] = new long[] { 10, 5, 2, 23, 19 };
        long arr2[] = new long[] { 19, 5, 3 };
        System.out.println("Is arr2 is the subset arr1: " + isSubset(arr1, arr2));
    }

    static String isSubset(long arr1[], long arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                j++;
            }
            i++;
        }
        if (j == arr2.length) {
            return "Yes";
        }
        return "No";
    }

}
