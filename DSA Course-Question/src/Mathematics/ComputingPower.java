package Mathematics;

public class ComputingPower {
    public static void main(String args[]) {
        System.out.println("The result: " + Power(3, 5));
    }

    public static long Power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        long temp = Power(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        }

        return temp * x;
    }

}
