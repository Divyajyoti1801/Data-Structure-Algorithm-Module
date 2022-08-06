package Mathematics;

public class FindNumberOfDigits {
    public static void main(String args[]) {
        int num = 0;
        System.out.println("The number of digits in the number: " + countDigits(num));
        System.out.println("The number of digits in the number(Recursive): " + recursiveCountDigits(num));
        // System.out.println("The number of digits in the number(logrithmic): " +
        // logrithmicCountDigits(num));

    }

    public static int countDigits(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static int recursiveCountDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + recursiveCountDigits(num / 10);
    }

    /*
     * public static double logrithmicCountDigits(int num) {
     * return Math.floor((double) Math.log10(num) + 1);
     * }
     */
}
