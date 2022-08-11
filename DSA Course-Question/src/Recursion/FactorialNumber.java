package Recursion;

public class FactorialNumber {
    public static void main(String args[]) {
        System.out.println("The Factorial of the number: " + factorialNumber(5));
    }

    public static int factorialNumber(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialNumber(n - 1);
    }
}
