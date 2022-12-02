package StringProgram;

import java.util.*;

public class LongestCommonSubsequence {
    static List<String> al = new ArrayList<>();

    public static void main(String args[]) {
        String s1 = "ABCAB";
        String s2 = "PBCC";
        printingSubSequence(s1, "");
        System.out.println(al);
        al.clear();
        printingSubSequence(s2, "");
        System.out.println(al);
        int m = s1.length();
        int n = s2.length();
        System.out.println("Longest Common Subsequence (Approach-1): " + LongestCommonSubsequenceAp1(m, n, s1, s2));
        System.out.println("Longest Common Subsequence (Approach-2): " + LongestCommonSubsequenceAp2(m, n, s1, s2));
    }

    // Dynamic Programming
    /*
     * Dynamic Programming is a technique that breaks the problems into
     * sub-problems, and save the result for future purposes so that
     * we do not need to compute result again. The Subproblem are optimized to
     * optimize the overall solution is known as optimal substructure property.
     */
    /*
     * Empty String can never be a sub sequence. The order of character must be
     * followed compared to original string
     */

    static void printingSubSequence(String str, String newStr) {
        if (str.length() == 0) {
            al.add(newStr);
            return;
        }

        printingSubSequence(str.substring(1), newStr + str.charAt(0));
        printingSubSequence(str.substring(1), newStr);
    }

    static int LongestCommonSubsequenceAp1(int m, int n, String a, String b) {
        return lcsUtil(m, n, a, b);
    }

    static int lcsUtil(int m, int n, String a, String b) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return 1 + lcsUtil(m - 1, n - 1, a, b);
        } else {
            return Math.max(lcsUtil(m, n - 1, a, b), lcsUtil(m - 1, n, a, b));
        }
    }

    static int LongestCommonSubsequenceAp2(int m, int n, String a, String b) {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return lcsUtil2(m, n, a, b, dp);
    }

    static int lcsUtil2(int m, int n, String a, String b, int dp[][]) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return dp[m][n] = 1 + lcsUtil2(m - 1, n - 1, a, b, dp);
        } else {
            return dp[m][n] = Math.max(lcsUtil2(m, n - 1, a, b, dp), lcsUtil2(m - 1, n, a, b, dp));
        }

    }

}
