package SortingTechnique;

public class HoarePartition {
    public static void main(String args[]) {
        int arr[] = new int[] { 5, 3, 8, 4, 2, 7, 1, 10 };
        System.out.println("The new location to pivot point: " + hoarePartition(arr, 0, arr.length - 1));
    }

    public static int hoarePartition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
