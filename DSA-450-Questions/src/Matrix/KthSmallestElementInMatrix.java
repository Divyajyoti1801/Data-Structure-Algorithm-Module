package Matrix;

import java.util.Arrays;

public class KthSmallestElementInMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][] { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 24, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int n = mat.length;
        int k = 7;
        System.out.println("The Kth smallest element in matrix: " + kthSmallestElement(mat, n, k));
    }

    static int kthSmallestElement(int mat[][], int n, int k) {
        int[] arr = new int[n * n];
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[a] = mat[i][j];
                a++;
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
