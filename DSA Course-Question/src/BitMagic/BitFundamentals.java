package BitMagic;

public class BitFundamentals {
    public static void main(String args[]) {
        int x = 5, y = 6;
        System.out.println("AND Operator: " + (x & y));
        System.out.println("OR Operator: " + (x | y));
        System.out.println("XOR Operator: " + (x ^ y));
        System.out.println("NOT Operator: " + (~x));
        // Left Shift operation
        System.out.println("The Left-Shif opeation: " + (3 << 1));
        // Right Shift operation
        System.out.println("The Right-Shift operation: " + (-2 >>> 1));

    }
}
