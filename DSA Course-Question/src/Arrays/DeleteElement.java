package Arrays;


public class DeleteElement {
    public static void main(String args[]){
        int[] arr=new int[]{3,8,12,5,6};
        int pos=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==12){
                pos=i;
                break;
            }
        }
        if(pos==arr.length){
            System.out.println("Element Not Found");
            return;
        }
        for(int j=pos;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
    
        
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
