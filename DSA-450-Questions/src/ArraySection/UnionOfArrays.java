package ArraySection;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String args[]) {
        int a[] = new int[] { 1, 2, 3, 4, 5 };
        int b[] = new int[] { 1, 2, 3 };
        System.out.println("Number of Elements in Union: " + unionArrays(a, b));
        System.out.println("Number of Elements in Union of Array: " + unionArraysOpt(a, b));
    }

    // This Code is Working for smaller inputs
    static int unionArrays(int a[], int b[]) {
        int count = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else {
                if (a[i] < b[j]) {
                    i++;
                    count++;
                } else {
                    j++;
                    count++;
                }
            }
        }
        while (i < n) {
            count++;
            i++;
        }
        while (j < m) {

            count++;
            j++;
        }
        return count;
    }

    static int unionArraysOpt(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i : a) {
            set.add(i);
        }
        for (int j : b) {
            set.add(j);
        }
        return set.size();
    }
}
