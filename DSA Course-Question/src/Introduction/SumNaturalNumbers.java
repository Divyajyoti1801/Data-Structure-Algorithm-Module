package Introduction;

public class SumNaturalNumbers {
    public static void main(String args[]) {
        int n = 10;
        System.out.println("The Sum of " + n + " natural numbers: " + sumOfNatural(n));
    }

    static int sumOfNatural(int n) {
        return (n * (n + 1)) / 2;
    }
}
