package BitMagic;

public class OddOccuringNumber {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 4, 4, 4, 5, 5 };
        // XOR of all the elements
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println("The Element appear odd-time: " + res);

    }
}
