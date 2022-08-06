package Mathematics;

public class AllDivisor {
    public static void main(String args[]) {
        int num = 15;
        nAllDivisor(num);
        allDivisior(num);
    }

    public static void nAllDivisor(int num) {
        System.out.println("All the Divisior of " + num + " (Simple): ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void allDivisior(int num) {
        System.out.println("All the Divisior of " + num + " (optimized): ");
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != (num / i)) { // This is for avoiding redunant output of perfect square
                    System.out.print((num / i) + " ");
                }
            }
        }
        System.out.println();
    }
}
