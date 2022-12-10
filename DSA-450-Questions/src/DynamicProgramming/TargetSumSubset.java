package DynamicProgramming;

public class TargetSumSubset {
    public static void main(String args[]) {
        int numbers[] = new int[] { 4, 2, 7, 1, 3 };
        int Target_Sum = 10;
        System.out.println("Is Target Subset is available: " + targetSumSubset(numbers, Target_Sum));
    }

    static boolean targetSumSubset(int numbers[], int Target_Sum) {
        int n = numbers.length;
        boolean dp[][] = new boolean[n + 1][Target_Sum + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < Target_Sum + 1; j++) {
                int v = numbers[i - 1];
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        printDynamicProgrammingTable(dp);
        return dp[n][Target_Sum];
    }

    static void printDynamicProgrammingTable(boolean arr[][]) {
        System.out.println("Dynamic Programming Matrix: ");
        for (boolean[] a : arr) {
            for (boolean i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
