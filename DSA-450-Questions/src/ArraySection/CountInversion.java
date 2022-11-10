package ArraySection;

public class CountInversion {
    public static void main(String args[]) {
        int arr[] = new int[] { 2, 4, 1, 3, 5 };
        System.out.println("The number of Count Inversions: " + mergeSort(arr, 0, arr.length - 1));
    }

    static int mergeSort(int arr[], int l, int r) {
        int count_inv = 0;
        if (l < r) {
            int m = (l + (r - l)) / 2;
            count_inv += mergeSort(arr, l, m);
            count_inv += mergeSort(arr, m + 1, r);

            count_inv += merge(arr, l, m, r);
        }
        return count_inv;
    }

    static int merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int count_inv = 0;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Merging process
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                count_inv++;
            } else {
                arr[k] = R[j];
                j++;
                count_inv++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr[j];
            j++;
            k++;
        }
        return count_inv;
    }

}
