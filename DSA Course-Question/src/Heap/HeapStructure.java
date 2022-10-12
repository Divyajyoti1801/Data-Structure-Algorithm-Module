package Heap;

import java.util.PriorityQueue;

public class HeapStructure {
    public static int arr[] = new int[100];
    public static int size = 0;

    static void insert(int val) {
        size = size + 1;
        int index = size;
        arr[index] = val;

        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            } else {
                return;
            }
        }
    }

    static void deleteFromHeap() {
        if (size == 0) {
            System.out.println("Nothing to delete");
            return;
        }
        // Kind of PUT function: changing the root node element with last node element
        arr[1] = arr[size];
        size--;
        // Propagate root node to correct position
        int i = 1;
        while (i < size) {
            int leftIndex = 2 * i;
            int rightIndex = 2 * (i + 1);
            if (leftIndex < size && arr[leftIndex] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[leftIndex];
                arr[leftIndex] = temp;
            } else if (rightIndex < size && arr[rightIndex] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[rightIndex];
                arr[rightIndex] = temp;
            } else {
                return;
            }
        }

    }

    static void heapify(int arr[], int n, int i) {
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
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }

        /**
         * How to execute the code
         * for(int i=arr.length/2;i>0;i--){
         * heapify(arr,i);
         * }
         */

    }

    static void minHeapify(int arr[], int n, int i) {
        int smallest = i;
        int left = 2 * i;
        int right = 2 * (i + 1);
        if (left <= arr.length && arr[smallest] > arr[left]) {
            smallest = left;
        }
        if (right <= arr.length && arr[smallest] > arr[right]) {
            smallest = right;
        }
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        /**
         * How to execute the code
         * for(int i=arr.length/2;i>0;i--){
         * heapify(arr,i);
         * }
         */
    }

    static void HeapSort(int arr[], int n) {
        int size = n;
        while (size > 1) {
            int temp = arr[size];
            arr[size] = arr[1];
            arr[1] = temp;
            size--;

            heapify(arr, size, 1);
        }
    }

    static void print(int arr[]) {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // arr[0] = -1;
        // insert(50);
        // insert(55);
        // insert(53);
        // insert(52);
        // insert(54);
        // print();
        // deleteFromHeap();
        // print();

        int arr2[] = new int[] { -1, 54, 53, 55, 52, 50 };
        int n = arr2.length - 1;
        // heap Creation
        for (int i = n / 2; i > 0; i--) {
            heapify(arr2, n, i);
        }
        // Print after Heapify
        for (int i = 1; i <= n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // Heap Sort
        System.out.println("After Using Heap Sort: ");
        HeapSort(arr2, n);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // Priority Queue is basically do all the implementation of Heap and its
        // underlying algorithm
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(100);
        pQueue.add(50);
        pQueue.add(0);
        pQueue.add(1);
        pQueue.add(12);
        // This will show the top element of the queue
        System.out.println(pQueue.peek());
        // Traversing through Queue
        for (int p : pQueue) {
            System.out.print(p + " ");
        }
        System.out.println();
        // To remove the top element form the Queue
        System.out.println(pQueue.poll());

    }
}
