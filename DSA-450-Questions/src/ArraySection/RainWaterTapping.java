package ArraySection;

public class RainWaterTapping {
    public static void main(String args[]) {
        int arr[] = new int[] { 3, 0, 0, 2, 0, 4 };
        System.out.println("The Amount of Water Stored: " + trappingRainWaterProblem(arr));

    }

    static int trappingRainWaterProblem(int arr[]) {
        int stored_water = 0;
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            stored_water += Math.min(left[i], right[i]) - arr[i];
        }

        return stored_water;

    }
}
