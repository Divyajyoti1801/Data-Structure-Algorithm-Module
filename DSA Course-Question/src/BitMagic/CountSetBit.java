package BitMagic;

public class CountSetBit {
    public static void main(String args[]) {
        // Given non negative integer
        int n = 5;
        System.out.println("Number of SET-BIT(Naive): " + NaiveSetBit(n));
        System.out.println("BrainKrningam Algorithm: " + BrianKarningam(n));

    }

    public static int NaiveSetBit(int n) { // theta(total bits of n)
        int res = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }

    public static int BrianKarningam(int n) {
        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }
        return res;
    }
}
