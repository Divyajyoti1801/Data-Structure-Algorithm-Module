package Recursion;

public class SumOfNauralNumber {
    public static void main(String args[]) {
        System.out.println("Sum of Natural Number: " + sumOfNaturalNumber(10));
    }

    public static int sumOfNaturalNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumber(n - 1);
    }
}
