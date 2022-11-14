package ArraySection;

import java.util.*;

public class CommonInThreeSortedArrays {
    public static void main(String args[]) {
        int a[] = new int[] { 1, 5, 10, 20, 40, 80 };
        int b[] = new int[] { 6, 7, 20, 80, 100 };
        int c[] = new int[] { 3, 4, 15, 20, 30, 70, 80, 120 };
        ArrayList<Integer> result = commonElementInThree(a, b, c);
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    static ArrayList<Integer> commonElementInThree(int a[], int b[], int c[]) {
        int m3 = c.length;
        // Create a HashSet in order to avoid duplicate elements in the array
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Putting arrays into there respective set
        for (int i : a) {
            A.add(i);
        }
        for (int i : b) {
            B.add(i);
        }

        // Checking for intersection
        for (int i = 0; i < m3; i++) {
            if (A.contains(c[i]) && B.contains(c[i])) {
                if (result.contains(c[i]) == false) {

                }
                result.add(c[i]);
            }
        }
        System.out.println();
        // Converting set to ArrayList
        ArrayList<Integer> result_arr = new ArrayList<>(result);
        Collections.sort(result_arr);
        return result_arr;

    }
}
