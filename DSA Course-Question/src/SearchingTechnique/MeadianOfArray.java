package SearchingTechnique;

public class MeadianOfArray {
    public static void main(String args[]) {
        int a1[] = new int[] { 10, 20, 30, 40 };
        int a2[] = new int[] { 5, 15, 25, 35, 45, 55, 65, 75, 85 };
        System.out.println("The Median of Arrays: " + medianOfArray(a1, a2));

    }

    public static double medianOfArray(int a1[], int a2[]) {
        int begin1 = 0, end1 = a1.length;
        while (begin1 < end1) {
            int i1 = (begin1 + end1) / 2;
            int i2 = ((a1.length + a2.length + 1) / 2) - i1;
            int min1 = (i1 == a1.length) ? Integer.MAX_VALUE : a1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a1[i1 - 1];
            int min2 = (i2 == a2.length) ? Integer.MAX_VALUE : a2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : a2[i2 - 1];
            if (max1 <= min2 && max2 <= min1) {
                if ((a1.length + a2.length) % 2 == 0) {
                    return ((double) Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                } else {
                    return (double) Math.max(max1, max2);
                }
            } else if (max1 > min2) {
                end1 = i1 - 1;
            } else {
                begin1 = i1 + 1;
            }
        }
        return -1;
    }

}
