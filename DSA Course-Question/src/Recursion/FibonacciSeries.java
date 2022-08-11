package Recursion;

public class FibonacciSeries {
    public static void main(String args[]) {
        System.out.println("The Fibonacci Number for 5: " + fibonacciSeries(5));
    }

    public static int fibonacciSeries(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return (fibonacciSeries(n - 1) + fibonacciSeries(n - 2));

    }
}
