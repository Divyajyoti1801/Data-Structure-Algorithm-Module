package Arrays;

public class SlidingWindow {
    public static void main(String args[]){
        int arr[]=new int[]{10,5,-2,20,1};    
        System.out.println("Naive: "+NaiveslidingWindow(arr, 3));
        System.out.println("Optimized: "+OptimizedslidingWindow(arr, 3));
    }
    
    public static int NaiveslidingWindow(int arr[],int k){
        int res=Integer.MIN_VALUE;
        for(int i=0;i+k-1<arr.length;i++){
            int curr=0;
            for(int j=0;j<k;j++){
                curr+=arr[i+j];
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    
    public static int OptimizedslidingWindow(int arr[],int k){
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        int res=curr;
        for(int i=k;i<arr.length;i++){
            curr=curr+arr[i]+arr[i-k];
            res=Math.max(res,curr);
        }
        return res;
    }
}
