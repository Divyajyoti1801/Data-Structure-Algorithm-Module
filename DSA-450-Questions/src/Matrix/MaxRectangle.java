package Matrix;

public class MaxRectangle {
    public static void main(String args[]) {
        int M[][] = new int[][] { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
        int n = M.length;
        int m = M[0].length;
        System.out.println("The Max Area of Rectangle: " + maxRectangle(M, n, m));
    }

    static int maxRectangle(int M[][], int n, int m) {
        int arr[] = new int[m];
        int a = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += M[i][j];
            }
            arr[a] = sum;
            a++;
        }
        int max_area = arr[0];
        int area = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                area = arr[i] * (i);
            } else {
                area = arr[i];
            }
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }
}
