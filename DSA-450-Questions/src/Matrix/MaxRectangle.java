package Matrix;

import java.util.Stack;

public class MaxRectangle {
    public static void main(String args[]) {
        int M[][] = new int[][] { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
        int n = M.length;
        int m = M[0].length;
        System.out.println("The Max Area of Rectangle: " + maxRectangle(M, n, m));
    }

    static int maxRectangle(int M[][], int n, int m) {
        int a[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            a[0][i] = M[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] == 1) {
                    a[i][j] = M[i][j] - a[i - 1][j];
                }
            }
        }
        Stack<Integer> s = new Stack<>();
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int left[] = new int[m];
            int j = 0;
            while (j < m) {
                while (!s.isEmpty() && a[i][s.peek()] >= a[i][j]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    left[j] = 0;
                } else {
                    // Not completed
                }
            }
        }
        return ans;
    }
}
