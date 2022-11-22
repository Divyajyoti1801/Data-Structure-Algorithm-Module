package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralTraversalOfMatrix {
    public static void main(String args[]) {
        int matrix[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println("The Matrix: ");
        printMatrix(matrix);
        Integer result[] = new Integer[spiralTraversalOfMatrix(matrix).size()];
        result = spiralTraversalOfMatrix(matrix).toArray(result);
        System.out.println("Spiral Traversal of a Matrix: " + Arrays.toString(result));
    }

    public static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static ArrayList<Integer> spiralTraversalOfMatrix(int arr[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length != arr[0].length) {
            result.add(-1);
            return result;
        }
        int row = 0;
        int row_start = 0;
        int row_end = arr.length - 1;
        int col = 0;
        int col_start = 0;
        int col_end = arr[0].length - 1;
        while (row_start < row_end && col_start < col_end) {
            col = col_start;
            while (col <= col_end) {
                result.add(arr[row_start][col]);
                col++;
            }
            row_start++;
            row = row_start;
            while (row <= row_end) {
                result.add(arr[row][col_end]);
                row++;
            }
            col_end--;
            col = col_end;
            if (row_start <= row_end) {
                while (col >= col_start) {
                    result.add(arr[row_end][col]);
                    col--;
                }
                row_end--;
            }
            row = row_end;
            if (col_start <= col_end) {
                while (row >= row_start) {
                    result.add(arr[row][col_start]);
                    row--;
                }
                col_start++;
            }
        }
        return result;
    }
}
