package Arrays;

public class TransferAllZeroEnd {
    public static void main(String args[]){
        int arr[]=new int[]{8,5,0,10,0,20};
        MySolution(arr);
        transferAllZeroEnd(arr);
    }
    
    public static void MySolution(int[] arr){
        int[] result=new int[arr.length];
        int high=arr.length-1;
        int low=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                result[high]=arr[i];
                high--;
            }
            else{
                result[low]=arr[i];
                low++;
            }
        }
        
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }


    public static void transferAllZeroEnd(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
