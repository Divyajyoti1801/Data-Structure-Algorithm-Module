package BitMagic;

public class PowerOfTwo {
    public static void main(String args[]) {
        System.out.println(NaivePowTwo(6));
        System.out.println("Briankarningam: " + BrianKarnigam(6));
    }

    public static boolean NaivePowTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if ((n & 1) != 0) {
                return false;
            }
            n = n >> 1;
        }
        return true;
    }

    public static boolean BrianKarnigam(int n) {
        if (n == 0) {
            return false;
        }
        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }
        if (res == 1) {
            return true;
        }
        return false;
    }
}
