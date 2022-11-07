package ArraySection;

public class MinimumNumberOfJumps {
    public static void main(String args[]) {
        int arr[] = { 1, 4, 3, 2, 6, 7 };
        System.out.println("The Number of Jumps: " + minimumNumberOfJumps(arr));
    }

    static int minimumNumberOfJumps(int arr[]) {
        int count = 0;
        int jump = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (jump <= arr.length - 1) {
                count++;
            } else {
                return count + 1;
            }
            jump += arr[jump];
        }
        return count;
    }
}
