package SortingTechnique;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = new int[] { 2, 10, 8, 7 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        OptimizeBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void OptimizeBubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean swappped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swappped = true;
                }
            }
            if (!swappped) {
                break;
            }
        }
    }

}
