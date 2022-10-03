package SortingTechnique;

public class UnionOfSortedArray {
    public static void main(String args[]) {
        int a[] = new int[] { 3, 5, 8 };
        int b[] = new int[] { 2, 8, 9, 10, 15 };
        unionOfSortedArrayNaive(a, b);
    }

    public static void unionOfSortedArrayNaive(int a[], int b[]) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (b[j] < a[i]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (i > 0 && a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while (j < b.length) {
            if (j > 0 && b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
                j++;
            }
        }

    }
}
