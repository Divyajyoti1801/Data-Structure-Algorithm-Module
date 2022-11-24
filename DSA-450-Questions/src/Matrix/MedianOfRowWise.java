package Matrix;

import java.util.Arrays;

public class MedianOfRowWise {
    public static void main(String args[]) {
        int matrix[][] = new int[][] { { 1 }, { 2 }, { 3 } };
        int R = matrix.length;
        int C = matrix[0].length;
        System.out.println("The Median of Matrix row wise: " + medianOfMatrix(matrix, R, C));
    }

    static int medianOfMatrix(int matrix[][], int R, int C) {
        int arr[] = new int[R * C];
        int a = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[a] = matrix[i][j];
                a++;
            }
        }
        Arrays.sort(arr);
        return arr[((arr.length / 2) + 1) - 1];
    }
}
