package Recursion;

public class CutTheRope {
    public static void main(String args[]) {
        System.out.println("Cut the rope in maximum pieces: " + cutTheRope(9, 2, 2, 2));
    }

    public static int cutTheRope(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        int res = Max(cutTheRope(n - a, a, b, c), cutTheRope(n - b, a, b, c), cutTheRope(n - c, a, b, c));
        if (res == -1) {
            return -1;
        }

        return res + 1;

    }

    public static int Max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        }
        return a;
    }
}
