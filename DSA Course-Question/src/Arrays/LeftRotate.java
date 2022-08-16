package Arrays;

public class LeftRotate {
    public static void main(String args[]){
        int arr[]=new int[]{30,5,20};
        NaiveLeftRotate(arr);
        OptimizedLeftRotate(arr);

    }
    
    public static void NaiveLeftRotate(int arr[]){
        int[] result=new int[arr.length];
        result[arr.length-1]=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++){
            result[count]=arr[i];
            count++;
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
    
    public static void OptimizedLeftRotate(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
