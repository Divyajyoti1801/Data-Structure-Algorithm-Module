package BitMagic;

public class FindMissingNumber {
    public static void main(String args[]) {
        int[] arr = new int[] { 1, 4, 3 };
        int range1 = 0;
        for (int i = 1; i <= arr.length + 1; i++) {
            range1 = range1 ^ i;
        }
        int range2 = 0;
        for (int i = 0; i < arr.length; i++) {
            range2 = range2 ^ arr[i];
        }
        System.out.println(range1 ^ range2);
    }

}
