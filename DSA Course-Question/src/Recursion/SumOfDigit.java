package Recursion;

public class SumOfDigit {
    public static void main(String args[]) {
        System.out.println("Sum of Digit in the number: " + sumOfDigit(253, 0));

    }

    public static int sumOfDigit(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return sumOfDigit(n / 10, sum + (n % 10));
    }
}
