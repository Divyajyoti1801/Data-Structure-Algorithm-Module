package ArraySection;

//Getting Minimum and Maximum using less swapping/comparison
public class MaximumAndMinimum {

    static class Pair {
        int min, max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;

        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1000, 11, 445, 1, 330, 3000 };
        Pair minmax = getMinMax(arr, arr.length);
        System.out.println("Maximum of an Array: " + minmax.max);
        System.out.println("Minimum of an Array: " + minmax.min);
    }

}
