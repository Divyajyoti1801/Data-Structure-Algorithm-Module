package DynamicProgrammingTwo;

public class NthCatalanNumber {
    public static void main(String args[]) {
        int n = 6;
        System.out.println("Catalan's Number: " + catalanNumberRecursion(n));
        // Memoization
        System.out.println("Catalan's Number(Tabulation): " + catalanNumberMemoization(n));
    }

    static int catalanNumberRecursion(int n) {
        int res = 0;
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalanNumberRecursion(i) * catalanNumberRecursion(n - i - 1);
        }
        return res;
    }

    static int catalanNumberMemoization(int n) {
        int memo[] = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            memo[i] = 0;
            for (int j = 0; j < i; j++) {
                memo[i] += memo[j] * memo[i - j - 1];
            }
        }
        return memo[n];
    }
}
