package Arrays;

public class MaximumDifference {
    public static void main(String args[]){
        int arr[]=new int[]{30,10,8,2};
        System.out.println(CheckSorted(arr));
        System.out.println(maximumDifference(arr));

    }
    
    public static boolean CheckSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    
    public static int maximumDifference(int arr[]){
        if(CheckSorted(arr)){
            return arr[arr.length-1]-arr[0];
        }
        
        int res=arr[1]-arr[0], min=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.max(res, arr[i]-min);
            min=Math.min(min, arr[i]);
        }
        
        return res;
        
    }
}
