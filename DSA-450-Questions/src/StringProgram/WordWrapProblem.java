package StringProgram;

public class WordWrapProblem {
    public static void main(String args[]) {
        int[] nums = new int[] { 3, 2, 2, 5 };
        int k = 6;
    }

    static int wordWrap(int nums[], int k) {
        int extras[][] = new int[nums.length + 1][nums.length + 1];
        int lc[][] = new int[nums.length + 1][nums.length + 1];
        int c[] = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
            extras[i][i] = k - nums[i - 1];
            for (int j = i; j <= nums.length; j++) {
                extras[i][j] = extras[i][j - 1] - nums[j - 1] - 1;
            }

        }
        return 0;

    }
}