package Arrays;

public class LeftRotateByD {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5};
        int shift=2;
        MyLeftRotateByD(arr, shift);
    }
    
    public static void MyLeftRotateByD(int arr[],int shift){
        //left rotate by shift-1 times
        int temp[]=new int[shift];
        for(int i=0;i<shift;i++){
            temp[i]=arr[i];
        }
        for(int i=shift;i<arr.length;i++){
            arr[i-shift]=arr[i];
        }
        
        for(int i=0;i<shift;i++){
            arr[arr.length-shift+i]=temp[i];
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
