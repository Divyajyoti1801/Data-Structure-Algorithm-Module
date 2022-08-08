package BitMagic;

public class TwoOddOccuring {
    public static void main(String args[]) {
        int[] arr = new int[] { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }

    }

}
