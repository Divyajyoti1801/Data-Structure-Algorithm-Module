package Arrays;

public class ReverseArray {
    public static void main(String args[]){
       int[] arr=new int[]{10,20,20,30,30,30};
       int low=0,high=arr.length-1;
       while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
       }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
