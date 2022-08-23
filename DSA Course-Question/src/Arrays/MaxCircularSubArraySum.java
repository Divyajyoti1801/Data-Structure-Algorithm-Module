package Arrays;

public class MaxCircularSubArraySum {
    public static void main(String args[]){
        int arr[]=new int[]{5,-2,3,4};
        System.out.println("Naive: "+NmaxCircularSubArraySum(arr));
        System.out.println("Optimized: "+maxCircularSubArraySum(arr));
    }
    
    public static int NmaxCircularSubArraySum(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr_max=arr[i];
            int curr_sum=arr[i];
            for(int j=1;j<arr.length;j++){
                int index=(i+j)%arr.length;
                curr_sum+=arr[index];
                curr_max=Math.max(curr_max,curr_sum);
            }
            res=Math.max(res,curr_max);
        }
        return res;
    }

    public static int normalMaxSum(int arr[]){
        int res=arr[0], maxEnding=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(arr[i], maxEnding+arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    
    public static int maxCircularSubArraySum(int arr[]){
        int normalSum=normalMaxSum(arr);
        if(normalSum<0){
            return normalSum;
        }
        int arr_sum=0;
        for(int i=0;i<arr.length;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];
        }
        int max_circular=arr_sum+normalMaxSum(arr);
        return Math.max(normalSum,max_circular);
    }

}

