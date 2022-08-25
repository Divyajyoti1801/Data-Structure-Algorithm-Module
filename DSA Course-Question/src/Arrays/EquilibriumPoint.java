package Arrays;

public class EquilibriumPoint {
    public static void main(String args[]){
        int arr[]=new int[]{4,2,2};
        System.out.println(equilibriumPoint(arr));
    }
    
    public static boolean equilibriumPoint(int arr[]){
        int sum=0,l_sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(l_sum==(sum-arr[i])){
                return true;
            }
            l_sum+=arr[i];
            sum-=arr[i];
        }
        return false;
    }
}
