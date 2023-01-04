package DynamicProgrammingTwo;

public class LCSOfThree {
    public static void main(String args[]) {
        String A = "geeks";
        String B = "geeksfor";
        String C = "geeksforgeeks";
        int n1 = A.length();
        int n2 = B.length();
        int n3 = C.length();
        System.out.println("Longest Common Subsequence of 3 Strings: " + LCSof3(A, B, C, n1, n2, n3));
    }

    static int LCSof3(String A, String B, String C, int n1, int n2, int n3) {
        int dp[][][] = new int[n1 + 1][n2 + 1][n3 + 1];
        for (int i = 0; i < n1 + 1; i++) {
            for (int j = 0; j < n2 + 1; j++) {
                for (int k = 0; k < n3 + 1; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return check(A, B, C, n1 - 1, n2 - 1, n3 - 1, dp);
    }

    static int check(String A, String B, String C, int n1, int n2, int n3, int dp[][][]) {
        if (n1 < 0 || n2 < 0 || n3 < 0) {
            return 0;
        }
        if (dp[n1][n2][n3] != -1) {
            return dp[n1][n2][n3];
        }
        if (A.charAt(n1) == B.charAt(n2) && B.charAt(n2) == C.charAt(n3)) {
            return dp[n1][n2][n3] = 1 + check(A, B, C, n1 - 1, n2 - 1, n3 - 1, dp);
        } else {
            int a1 = check(A, B, C, n1 - 1, n2, n3, dp);
            int a2 = check(A, B, C, n1, n2 - 1, n3, dp);
            int a3 = check(A, B, C, n1, n2, n3 - 1, dp);
            return dp[n1][n2][n3] = Math.max(a1, Math.max(a2, a3));
        }
    }
}
