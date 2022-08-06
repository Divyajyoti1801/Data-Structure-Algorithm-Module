package Mathematics;

public class LeastCommonMultiple {
    public static void main(String args[]) {
        int a = 4, b = 6;
        System.out.println("The Least Common Multiple of " + a + ", " + b + ": " + LCM(a, b));
    }

    public static int LCM(int a, int b) {
        int gcd = GreatestCommonDivisor.GCD(a, b);
        return (a * b) / gcd;
    }

}
