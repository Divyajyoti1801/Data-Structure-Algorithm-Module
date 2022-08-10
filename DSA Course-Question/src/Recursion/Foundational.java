package Recursion;

public class Foundational {
    public static void main(String args[]) {
        // Direct recursion and Indeirect Recursion
        // Base condition + recursive calls
        // large problem solved by small problem
        /*
         * Many algorihtm techiniques are based on recursion
         * Dynamic Programming, Back-Tracking, Divide and Conqueror, Binary Search,
         * Quick Sort and Merge Sort
         * Tower of hanoi, DFS based traversals inheritently recursive in nature
         * Recursive have high overhead, simple code efficiently
         */

        // Trial One
        trialOne(5);
        System.out.println();
        System.out.println("Print Binary of the number 13:");
        printBinary(13);
        System.out.println();
        System.out.println(0 % 2);
    }

    public static void trialOne(int n) {
        if (n == 0) {
            return;
        }
        trialOne(n - 1);
        System.out.print(n + " ");
        trialOne(n - 1);
        System.out.println();

    }

    public static void printBinary(int n) {
        if (n == 0) {
            return;
        }
        printBinary(n / 2);
        System.out.print(n % 2);
    }
}
