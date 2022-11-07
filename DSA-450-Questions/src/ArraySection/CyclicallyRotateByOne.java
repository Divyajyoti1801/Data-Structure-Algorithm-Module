package ArraySection;

import java.util.Arrays;

public class CyclicallyRotateByOne {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        rotateByOne(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void rotateByOne(int arr[]) {
        int temp[] = new int[arr.length];
        temp[0] = arr[arr.length - 1];
        for (int i = 1; i < temp.length; i++) {
            temp[i] = arr[i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
