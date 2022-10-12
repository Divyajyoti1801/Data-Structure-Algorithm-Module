package SortingTechnique;

public class HeapSort {
    public static void main(String args[]) {
        int arr[] = new int[] { -1, 70, 60, 55, 45, 50 };
        int n = arr.length - 1;
        System.out.println("After Sorting: ");
        heapSort(arr, n);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if (left <= n && arr[largest] < arr[left]) {
            largest = left;
        }
        if (right <= n && arr[largest] < arr[right]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int arr[], int n) {
        int size = n;
        while (size > 1) {
            int temp = arr[size];
            arr[size] = arr[1];
            arr[1] = temp;
            size--;
            heapify(arr, size, 1);
        }
    }
}
