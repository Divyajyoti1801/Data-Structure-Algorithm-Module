package Matrix;

public class RowWithMaximumOne {
    public static void main(String args[]) {
        int arr[][] = new int[][] { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("The Matrix row with maximum number of One's: " + rowWithMaxOne(arr, n, m));
    }

    static int rowWithMaxOne(int arr[][], int n, int m) {
        int row = 0;
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            if (sum > count && sum != 0) {
                count = sum;
                row = i;
            }
        }
        return row;
    }
}
