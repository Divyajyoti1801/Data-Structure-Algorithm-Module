package SearchingTechnique;

public class FindOccurences {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 20, 20, 20, 30, 30 };
        System.out.println("The number of occurences: " + findOccurences(arr, 20));
    }

    public static int findOccurences(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}
