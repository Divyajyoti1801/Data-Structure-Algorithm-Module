package SortingTechnique;

public class KthSmallestElement {
    public static void main(String args[]) {
        int arr[] = new int[] { 30, 20, 5, 10, 8 };
        System.out.println("Kth Smallest Element: " + smallestElement(arr, 4));

    }

    public static int smallestElement(int arr[], int k) {
        QuickSortWithHoarePatition.quikSortHoare(arr, 0, arr.length - 1);
        return arr[k - 1];
    }
}
