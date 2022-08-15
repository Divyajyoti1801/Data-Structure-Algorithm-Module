package Arrays;

public class CheckSortedArray {
    public static void main(String args[]){
        int arr[]=new int[]{5,12,30,2,35};
        System.out.println("Array is sortes?: "+checkSorted(arr));
        
    }

    public static boolean checkSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
