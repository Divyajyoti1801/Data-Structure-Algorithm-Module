package SortingTechnique;

public class MinimumDifferenceInArray {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 8, 12, 5, 18 };
        System.out.println("The minimum difference in an Array: " + minimumDifferenceArray(arr));

    }

    public static int minimumDifferenceArray(int arr[]) {
        int res = Integer.MAX_VALUE;
        QuickSortWithHoarePatition.quikSortHoare(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            int sub = Math.abs(arr[i] - arr[i - 1]);
            if (sub < res) {
                res = sub;
            }
        }
        return res;
    }
}
