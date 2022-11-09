package ArraySection;

import java.util.Arrays;

public class FindDuplicateInNPlus1 {
    public static void main(String args[]) {
        int arr[] = new int[] { 3, 1, 3, 4, 2 };
        System.out.println("The Duplicate Element in the Array: " + duplicateInArray(arr));
    }

    static int duplicateInArray(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
