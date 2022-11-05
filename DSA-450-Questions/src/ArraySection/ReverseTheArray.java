package ArraySection;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String str = "Divyajyoti";
        System.out.println("The reverse of the Array: ");
        reverseOfArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The reverse of the String: " + reverseOfString(str, str.length() - 1, ""));
    }

    static String reverseOfString(String str, int i, String newStr) {
        if (i < 0) {
            return newStr;
        }
        return reverseOfString(str, i - 1, newStr + str.charAt(i));
    }

    static void reverseOfArray(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
