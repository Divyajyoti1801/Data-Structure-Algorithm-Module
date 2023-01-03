package DynamicProgrammingTwo;

public class AssemblyLineSchedulingProblem {
    static int num_station = 4;
    static int num_line = 2;

    public static void main(String args[]) {
        int a[][] = new int[][] { { 4, 5, 3, 2 }, { 2, 10, 1, 4 } };
        int t[][] = new int[][] { { 0, 7, 4, 5 }, { 0, 9, 2, 8 } };
        int e[] = new int[] { 10, 12 };
        int x[] = new int[] { 18, 7 };
        System.out.println("Car Assembly Line Scheduling: " + assemblyLineRecursive(a, t, e, x));
        System.out.println("Car Assembly Line Scheduling(Dynamic Programming): " + assemblyLineDP(a, t, e, x));
    }

    static int MinimumCalc(int a, int b) {
        return a < b ? a : b;
    }

    static int assemblyLineRecursive(int a[][], int t[][], int e[], int x[]) {
        int T1[] = new int[num_station];
        int T2[] = new int[num_station];
        int i;
        T1[0] = e[0] + a[0][0];
        T2[0] = e[1] + a[1][0];
        for (i = 1; i < num_station; i++) {
            T1[i] = MinimumCalc(T1[i - 1] + a[0][i], T2[i - 1] + t[1][i] + a[0][i]);
            T2[i] = MinimumCalc(T2[i - 1] + a[1][i], T1[i - 1] + t[0][i] + a[1][i]);
        }
        return MinimumCalc(T1[num_station - 1] + x[0], T2[num_station - 1] + x[1]);
    }

    static int assemblyLineDP(int a[][], int t[][], int e[], int x[]) {
        int n = a[0].length;
        int first = e[0] + a[0][0];
        int second = e[1] + a[1][0];
        for (int i = 1; i < n; i++) {
            int up = Math.min(first + a[0][i], second + t[1][i] + a[0][i]);
            int down = Math.min(second + a[1][i], first + t[0][i] + a[1][i]);
            first = up;
            second = down;
        }
        first += x[0];
        second += x[1];
        return Math.min(first, second);
    }

}
