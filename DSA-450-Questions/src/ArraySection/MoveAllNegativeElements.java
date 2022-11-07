package ArraySection;

import java.util.Arrays;

public class MoveAllNegativeElements {
    public static void main(String args[]) {
        int arr[] = new int[] { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        moveAllNegative(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveAllNegative(int arr[]) {
        Arrays.sort(arr);
    }

}
