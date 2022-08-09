package BitMagic;

public class PowerSet {
    public static void main(String args[]) {
        String str = "abc";
        System.out.println("Subsets of String (Naive): ");
        NaivePowerSet(str);
        System.out.println("Subset of Strings (Optimized): ");

    }

    public static void NaivePowerSet(String str) {
        int n = str.length();
        int powSize = (int) Math.pow(2, n);
        for (int i = 0; i < powSize; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j) + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
