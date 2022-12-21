package DynamicProgrammingTwo;

public class PermutationCoefficient {
    public static void main(String args[]) {
        int n = 10;
        int k = 2;
        System.out.println("Permutation Coefficient(Recursion Method): " + permutationCoefficient(n, k));
        System.out.println("Permutation Coefficient(Tabulation Method): " + permutationCoefficientTabulation(n, k));
    }

    static int permutationCoefficient(int n, int k) {
        int mod = (int) (Math.pow(10, 9)) + 7;
        if (n == 0 || n == 1) {
            return 1;
        }
        return (factorial(n) / factorial(n - k)) % mod;

    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Tabulation Method
    static int permutationCoefficientTabulation(int n, int k) {
        int[] fact = new int[n + 1];
        int mod = (int) (Math.pow(10, 9)) + 7;
        fact[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            fact[i] = i * fact[i - 1];
        }
        return (fact[n] / fact[n - k]) % mod;
    }
}
