package Hashing;

import java.util.*;

public class UnionOfArrays {
    public static void main(String args[]) {
        int A[] = new int[] { 3, 5, 8 };
        int B[] = new int[] { 2, 8, 9, 10, 15 };
        HashSet<Integer> union = new HashSet<>();
        for (int a : A) {
            union.add(a);
        }
        for (int b : B) {
            union.add(b);
        }
        System.out.println("The union two unsorted Array: ");
        System.out.println(union);
        unionFunc(A, B);
    }

    // Another method for finding union of two unsorted array
    static void unionFunc(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (b[j] < a[i]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (i > 0 && a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while (j < b.length) {
            if (j > 0 && b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        System.out.println();

    }
}
