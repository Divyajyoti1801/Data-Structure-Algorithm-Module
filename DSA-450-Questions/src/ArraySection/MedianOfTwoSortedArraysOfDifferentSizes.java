package ArraySection;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArraysOfDifferentSizes {
    public static void main(String args[]) {
        int a[] = new int[] { -5, 3, 6, 12, 15 };
        int b[] = new int[] { -12, -10, -6, -3, 4, 10 };
        System.out.println("The Median of two Sorted Arrays: " + medianOfTwoSortedArrays(a, b));

    }

    static int medianOfTwoSortedArrays(int a[], int b[]) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                temp.add(a[i]);
                i++;
            } else if (b[j] <= a[i]) {
                temp.add(b[j]);
                j++;
            }
        }
        while (i < a.length) {
            temp.add(a[i]);
            i++;
        }
        while (j < b.length) {
            temp.add(b[j]);
            j++;
        }
        Collections.sort(temp);
        int median = 0;
        if (temp.size() % 2 == 0) {
            int mid = temp.size() / 2;
            median = (temp.get(mid - 1) + temp.get(mid)) / 2;
        } else {
            int mid = temp.size() / 2;
            median = temp.get(mid);
        }
        return median;
    }
}
