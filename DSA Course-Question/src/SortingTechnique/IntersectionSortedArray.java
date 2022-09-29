package SortingTechnique;

public class IntersectionSortedArray {
    public static void main(String args[]) {
        int a[] = new int[] { 1, 20, 20, 40, 60 };
        int b[] = new int[] { 2, 20, 20, 20 };
        intersectionSortedArrayNaive(a, b);
        intersectionSortedArrayOptimized(a, b);
    }

    public static void intersectionSortedArrayNaive(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue; // This is to avoid duplicates
            }

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void intersectionSortedArrayOptimized(int a[], int b[]) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.println(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
