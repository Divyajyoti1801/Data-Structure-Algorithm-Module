package SearchingTechnique;

public class IndexOfFirstOccurence {
    public static void main(String args[]) {
        int arr[] = new int[] { 15, 15, 15 };
        System.out.println("Element First Occurence: " + indexOfFirstOccurence(arr, 15));

    }

    public static int indexOfFirstOccurence(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
