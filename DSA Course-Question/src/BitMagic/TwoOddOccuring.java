package BitMagic;

public class TwoOddOccuring {
    public static void main(String args[]) {
        int[] arr = new int[] { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };
        int res1 = 0, res2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & 1) == 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res1 + " " + res2);
    }

}
