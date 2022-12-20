package DynamicProgrammingTwo;

//Equal Partition Problem
public class SubsetSumProblem {
    public static void main(String args[]) {
        int N = 4; // array size
        int arr[] = new int[] { 1, 5, 11, 5 };
        System.out.println("The Subset problem: " + subsetEqualPartition(N, arr));
        // Memoization Approach
        System.out.println("The SubSet Sum Problem (Memoization): " + SubsetEqualPartitionMemo(N, arr));
        // Tabulation Approach
        System.out.println("The Subset Sum Problem (Tabulation): " + SubsetEqualPartitionTab(N, arr));

    }

    // Equal Partition Recursion Approach
    static int subsetEqualPartition(int n, int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return 0;
        }
        return equalPartition(0, arr, sum / 2);
    }

    static int equalPartition(int ind, int arr[], int sum) {
        if (sum == 0) {
            return 1;
        }
        if (ind == arr.length) {
            return 0;
        }
        if (arr[ind] > sum) {
            return equalPartition(ind + 1, arr, sum);
        } else {
            int op1 = equalPartition(ind + 1, arr, sum); // Element not considered
            int op2 = equalPartition(ind + 1, arr, sum - arr[ind]); // Element considered

            if (op1 == 1 || op2 == 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    // Equal Partition Memoization Approach
    static int SubsetEqualPartitionMemo(int N, int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return 0;
        }
        sum = sum / 2;
        int dp[][] = new int[N + 1][sum + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return MemoEqualPartition(arr, 0, sum, dp);
    }

    static int MemoEqualPartition(int arr[], int idx, int sum, int dp[][]) {
        if (sum == 0) {
            return dp[idx][sum] = 1;
        }
        if (idx == arr.length) {
            return dp[idx][sum] = 0;
        }
        if (dp[idx][sum] != -1) {
            return dp[idx][sum];
        }
        if (arr[idx] > sum) {
            return dp[idx][sum] = MemoEqualPartition(arr, idx + 1, sum, dp);
        } else {
            int op1 = MemoEqualPartition(arr, idx + 1, sum, dp);
            int op2 = MemoEqualPartition(arr, idx + 1, sum - arr[idx], dp);
            if (op1 == 1 || op2 == 1) {
                return dp[idx][sum] = 1;
            } else {
                return dp[idx][sum] = 0;
            }
        }
    }

    // Equal Partition: Tabulation
    static int SubsetEqualPartitionTab(int N, int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return 0;
        }
        sum = sum / 2;
        int[][] dp = new int[N + 1][sum + 1];
        for (int i = 0; i < N + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < sum + 1; i++) {
            dp[0][i] = 0;
        }
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i] > j) {
                    dp[i][j] = dp[i + 1][j];
                } else {
                    int op1 = dp[i + 1][j];
                    int op2 = dp[i + 1][j - arr[i]];
                    if (op1 == 1 || op2 == 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
        }
        return dp[0][sum];
    }


}
