package ArraySection;

public class MinimumNumberOfJumps {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println("The Number of Jumps: " + minimumNumberOfJumps(arr, arr.length));
    }

    static int minimumNumberOfJumps(int arr[], int n) {
        int maxR = arr[0]; // max Reaching point
        int step = arr[0]; // Step taken according to array
        int jump = 1; // Jumps till now
        if (n == 1) {
            return 0;
        } else if (arr[0] == 0) {
            return -1;
        } else {
            for (int i = 1; i < n; i++) {
                if (i == n - 1) {
                    return jump;
                }
                maxR = Math.max(maxR, i + arr[i]);
                step--;
                if (step == 0) {
                    jump++;
                    if (i > maxR) {
                        return -1;
                    }
                    step = maxR - i;
                }
            }

        }
        return -1;
    }
}
