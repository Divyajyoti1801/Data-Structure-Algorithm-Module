package Heap;

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

    static void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        arr[0] = -1;
        insert(50);
        insert(55);
        insert(53);
        insert(52);
        insert(54);
        print();
        deleteFromHeap();
        print();
    }
}
