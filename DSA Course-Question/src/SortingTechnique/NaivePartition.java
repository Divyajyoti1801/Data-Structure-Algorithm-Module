package SortingTechnique;

public class NaivePartition {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 80, 30, 90, 40, 50, 70 };
        naivePartition(arr, 6);
    }

    public static void naivePartition(int arr[], int p) {
        int temp[] = new int[(arr.length - 1) - 0 + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
