package DynamicProgrammingTwo;

public class LongestSubsequenceAdjacentDifferenceOne {
    public static void main(String args[]) {
        int A[] = new int[] { 10, 9, 4, 5, 4, 8, 6 };
        int N = A.length;
        System.out.println("Longest Subsequence - 1: " + solution(A, N));

    }

    static int solution(int A[], int N) {
        return solve(A, N, 0, -1);
    }

    static int solve(int A[], int N, int curr, int prev) {
        if (curr >= N) {
            return 0;
        }
        int include = 0;
        if (prev == -1 || Math.abs(A[curr] - A[prev]) == 1) {
            include = 1 + solve(A, N, curr + 1, curr);
        }
        int exclude = solve(A, N, curr + 1, prev);
        return Math.max(include, exclude);
    }
}
