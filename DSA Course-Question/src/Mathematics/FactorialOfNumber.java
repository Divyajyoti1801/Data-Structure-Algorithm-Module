package Mathematics;

public class FactorialOfNumber {
    public static void main(String args[]) {
        int n = 120;
        System.out.println("Factorial of the number: " + factorial(n));
        System.out.println("Number of Digits: " + countNumber(factorial(n)));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long countNumber(long n) {
        long count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;

    }
}
