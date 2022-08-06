package Mathematics;

public class TrailingZeroFactorial {
    public static void main(String args[]) {
        int n = 5;
        System.out.println("The Number of Trailing Zero(Simple Concept): " + NaiveTrailingZero(n));
        System.out.println("The Number of Trailing Zero(Efficeien Concept): " + TrailingZero(n));

    }

    public static int NaiveTrailingZero(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact /= 10;
        }
        return count;
    }

    public static int TrailingZero(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res = res + (n / i);
        }
        return res;
    }

}
