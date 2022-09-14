package SearchingTechnique;

import java.util.Arrays;

public class RepeatingElement {
    public static void main(String args[]) {
        int arr[] = new int[] { 0, 2, 1, 3, 2, 2 };
        System.out.println("Repeating Element (Naive): " + repeatingElementNaive(arr));
        System.out.println("Repeating Element (Efficient): " + repeatingElementEfficient(arr));
        System.out.println("Repeating Element (Super-Efficient): " + repeatingElementSuperEfficient(arr));
    }

    public static int repeatingElementNaive(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int repeatingElementEfficient(int arr[]) {
        boolean temp[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (temp[arr[i]]) {
                return arr[i];
            }
            temp[arr[i]] = true;
        }
        return -1;
    }

    public static int repeatingElementSuperEfficient(int arr[]) {
        int slow = arr[0] + 1, fast = arr[0] + 1;
        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        } while (slow != fast);
        slow = arr[0] + 1;
        while (slow != fast) {
            fast = arr[fast] + 1;
            slow = arr[slow] + 1;
        }
        return slow - 1;
    }
}
