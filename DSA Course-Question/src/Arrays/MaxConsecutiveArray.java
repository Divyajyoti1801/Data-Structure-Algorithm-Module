package Arrays;

public class MaxConsecutiveArray {
    public static void main(String args[]){
        int[] arr=new int[]{1,0,1,1,1,1,0,1,1};
        System.out.println(maxConsecutiveArray(arr));

    }

    public static int maxConsecutiveArray(int arr[]){
        int res=0,curr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res=Math.max(res, curr);
            }
        }
        return res;
    }
}
