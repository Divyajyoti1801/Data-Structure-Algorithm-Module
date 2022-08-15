package Arrays;

import java.util.Arrays;

public class FindTheSecondLargestElement {
    public static void main(String args[]){
        int[] arr=new int[]{10,5,8,9};
        Arrays.sort(arr);
        System.out.println("The Second Largest elment: "+arr[arr.length-2]);
        System.out.println("The Second Largest element(Naive): "+GetSecondLargestElement(arr));
        System.out.println("The Second Largest element(Optimized): "+OptimizedGetSecondLargest(arr));
    }
    
    public static int GetTheLargest(int arr[]){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }
    
    public static int GetSecondLargestElement(int arr[]){
        int largest=GetTheLargest(arr);
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1){
                    res=i;
                }
                else if(arr[res]<arr[i]){
                    res=i;
                }
            }
        }
        return arr[res];
    }
    
    public static int OptimizedGetSecondLargest(int arr[]){
        int res=-1,largest=0;
        for(int  i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return arr[res];
    }
    
}
