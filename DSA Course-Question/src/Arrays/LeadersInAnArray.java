package Arrays;

public class LeadersInAnArray {
    public static void main(String args[]){
        int arr[]=new int[]{7,10,4,3,6,5,2};
        leadersInArray(arr);
    }
    public static void leadersInArray(int arr[]){
        int curr_idr=arr[arr.length-1];
        System.out.print(curr_idr+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(curr_idr<arr[i]){
                curr_idr=arr[i];
                System.out.print(curr_idr+" ");
            }
        }
        System.out.println();
    }
}
