package Mathematics;

public class GreatestCommonDivisor {
    public static void main(String args[]) {
        int a = 16, b = 32;
        System.out.println("Greatest Common Divisior " + a + ", " + b + ": " + GCD(a, b));

    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
