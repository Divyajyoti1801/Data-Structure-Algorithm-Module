package Arrays;

public class SubArrayWithSum {
    public static void main(String args[]){
        int arr[]=new int[]{1,4,20,3,10,5};
        int sum=44;
        System.out.println(MysubArrayWithSum(arr, sum));
    }
    public static boolean MysubArrayWithSum(int arr[],int sum){
        int s=0,curr=0;
        for(int e=0;e<arr.length;e++){
            curr+=arr[e];
            while(sum<curr){
                curr-=arr[s];
                s++;
            }
            if(curr==sum){
                return true;
            }
            
        }
        return false;
    }
}
