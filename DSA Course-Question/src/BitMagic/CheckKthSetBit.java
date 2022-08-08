package BitMagic;

public class CheckKthSetBit {
    public static void main(String args[]) {
        int n = 5, k = 2;
        int mask = (1 << k);
        int bit = (n & mask);
        if (bit != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
}
