package Matrix;

public class RotateMatrixBy90Degree {
    public static void main(String args[]) {
        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Print the Array: ");
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array Rotated 90deg: ");
        rotated90deg(arr, n, m);
    }

    static void rotated90deg(int arr[][], int n, int m) {
        // Step-1: Making row element column element and column element row element a
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
