package Recursion;

public class JosephusProblem {
    public static void main(String args[]) {
        System.out.println("Survivor of Josephus Problem: " + josephusProblem(5, 2));
        System.out.println(3 % 5);

    }

    public static int josephusProblem(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (josephusProblem(n - 1, k) + k) % n;

    }
}
