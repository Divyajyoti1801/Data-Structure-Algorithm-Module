package Mathematics;

public class PrimeFactor {
    public static void main(String args[]) {
        int n = 12;
        System.out.println("The Prime Factor of " + n);
        primeFactor(n);
    }

    public static boolean isPrime(int n) {
        if (n % 2 != 0) {
            return false;
        }
        if (n % 3 != 0) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeFactor(int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}
