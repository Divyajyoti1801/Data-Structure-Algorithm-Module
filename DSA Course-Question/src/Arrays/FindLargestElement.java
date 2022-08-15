package Arrays;

import java.util.Arrays;

public class FindLargestElement {
    public static void main(String args[]){
        int[] arr=new int[]{5,8,20,10};
        Arrays.sort(arr);
        System.out.println("Largest Element in Array: "+arr[arr.length-1]);
        System.out.println("Largest Element in Array (Optimized): "+MostEfficientMaximum(arr));
        //Time Comlexity: theta(n);
    }
    
    public static int MostEfficientMaximum(int arr[]){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return arr[res];
    }
}
