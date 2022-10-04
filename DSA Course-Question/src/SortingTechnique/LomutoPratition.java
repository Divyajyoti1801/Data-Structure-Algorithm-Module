package SortingTechnique;

public class LomutoPratition {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 80, 30, 90, 40, 50, 70 };
        System.out.println("The new Index of Pivot Point: " + lomutoPartition(arr, 0, 6));

    }

    public static int lomutoPartition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = -1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }
}
