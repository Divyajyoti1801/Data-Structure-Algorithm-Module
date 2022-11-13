package ArraySection;

public class CountInversion {
    public static void main(String args[]) {
        int arr[] = new int[] { 2, 4, 1, 3, 5 };
        System.out.println("The number of Count Inversions: " + mergeSort(arr, 0, arr.length - 1));
    }

    static int mergeSort(int arr[], int l, int r) {
        int count_inv = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count_inv += mergeSort(arr, l, m);
            count_inv += mergeSort(arr, m + 1, r);

            count_inv += merge(arr, l, m, r);
        }
        return count_inv;
    }

    static int merge(int arr[], int l, int m, int r) {
        int count_inv = 0;
        int[] temp = new int[r - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count_inv += (m + 1 - i);
            }
        }
        while (i <= m) {
            temp[k++] = arr[i++];
        }
        while (j <= r) {
            temp[k++] = arr[j++];
        }
        for (int idx1 = 0, idx2 = l; idx1 < temp.length; idx1++) {
            arr[idx2++] = temp[idx1];
        }
        return count_inv;
    }

}
