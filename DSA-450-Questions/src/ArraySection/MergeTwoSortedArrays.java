package ArraySection;

public class MergeTwoSortedArrays {
    public static void main(String args[]) {
        int a[] = new int[] { 1, 5, 9, 10, 15, 20 };
        int b[] = new int[] { 2, 3, 8, 13 };
        mergeTwoSortedArray(a, b);
    }

    static void mergeTwoSortedArray(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while (i < n) {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < m) {
            System.out.print(b[j] + " ");
            j++;
        }
        System.out.println();
    }
}
