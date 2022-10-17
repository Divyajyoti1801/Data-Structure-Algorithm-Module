package Hashing;

import java.util.*;

public class IntersectionArray {
    public static void main(String args[]) {
        int A[] = new int[] { 1, 20, 20, 40, 60 };
        int B[] = new int[] { 2, 20, 20, 20 };
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }
        int count = 0;
        for (int b : B) {
            if (set.contains(b)) {
                count++;
                set.remove(b);
            }
        }
        System.out.println("The Intersection of two unsorted Array: " + count);
        intersectionFunc(A, B);

    }

    static void intersectionFunc(int a[], int b[]) {
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
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }

        }
        System.out.println();
    }
}
