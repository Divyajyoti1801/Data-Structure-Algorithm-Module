package Mathematics;

public class BinaryExponenetial {
    public static void main(String args[]) {
        System.out.println("The resultant: " + PowerBE(2, 10, 1000));
    }

    public static int PowerBE(int x, int n, int m) {
        int res = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                res = (res * x);
            }
            x = (x * x);
            n = n >> 1;
        }
        return res;
    }
}
