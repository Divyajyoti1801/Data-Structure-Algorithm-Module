package Matrix;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String args[]) {
        int Mat[][] = new int[][] { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int N = Mat.length;
        Mat = sortedMatrix(Mat, N);
        System.out.println("Sorted Matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] sortedMatrix(int Mat[][], int N) {
        int intrim[] = new int[N * N];
        int in = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                intrim[in] = Mat[i][j];
                in++;
            }
        }
        in = 0;
        Arrays.sort(intrim);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = intrim[in];
                in++;
            }
        }

        return Mat;
    }
}
