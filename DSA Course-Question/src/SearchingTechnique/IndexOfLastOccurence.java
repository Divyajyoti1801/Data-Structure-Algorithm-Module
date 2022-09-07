package SearchingTechnique;

public class IndexOfLastOccurence {
    public static void main(String args[]) {
        int arr[] = new int[] { 5, 8, 8, 10, 10 };
        System.out.println("Index of Last Occurence: " + indexOfLastOccurence(arr, 15));
    }

    public static int indexOfLastOccurence(int arr[], int x) {
        int pos = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == x && arr[i] == arr[i - 1]) {
                pos = i;
            }
        }
        return pos;
    }
}
