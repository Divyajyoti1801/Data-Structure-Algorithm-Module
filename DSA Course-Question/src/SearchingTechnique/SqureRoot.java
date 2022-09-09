package SearchingTechnique;

public class SqureRoot {
    public static void main(String args[]) {
        System.out.println("The Square Root of the Number: " + squareRoot(25));
        System.out.println("The Square Root of the Number(Naive): " + squareRootNaive(25));
        System.out.println("The Square Root of the Number(Efficient): " + squareRootEfficient(25));
    }

    public static int squareRoot(int n) {
        return (int) Math.floor(Math.pow(n, 0.5));
    }

    public static int squareRootNaive(int n) {
        int i = 1;
        while (i * i <= n) {
            i++;
        }
        return i - 1;
    }

    public static int squareRootEfficient(int n) {
        int low = 1, high = n, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mSq = mid * mid;
            if (mSq == n)
                return mid;
            else if (mSq > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
