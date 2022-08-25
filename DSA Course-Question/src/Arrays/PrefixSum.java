package Arrays;


public class PrefixSum {
    public static void main(String args[]){
        int arr[]=new int[]{2,8,3,9,6,5,4};
        NaiveprefixSum(arr, 0, 2);
    }
    
    public static void NaiveprefixSum(int arr[],int l,int h){
        int prefix_sum[]=new int[arr.length];
        prefix_sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_sum[i]=prefix_sum[i-1]+arr[i];
        }
        if(l!=0){
            System.out.println(prefix_sum[h]-prefix_sum[l-1]);
        }else{
            System.out.println(prefix_sum[h]);
        }
    }
}
