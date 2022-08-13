package Recursion;

public class SubSetSum {
    public static void main(String args[]) {
        int[] arr = new int[] { 10, 20, 15 };
        int n = 3;
        int sum = 25;

        System.out.println("Subset Sum: " + subSetSum(arr, n, sum));

    }

    public static int subSetSum(int arr[], int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return subSetSum(arr, n - 1, sum) + subSetSum(arr, n - 1, sum - arr[n - 1]);
    }
}
