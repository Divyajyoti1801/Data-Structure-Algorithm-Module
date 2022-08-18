package Arrays;

public class FrequencyInSortedArray {
    public static void main(String args[]){
        int arr[]=new int[]{10,20,30};
        MyFrequencyInSortedArray(arr);
    }

    public static void MyFrequencyInSortedArray(int arr[]){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                System.out.println(arr[i]+" : "+count);
                count=1;
            }
        }
        if(count!=1){
            System.out.println(arr[arr.length-2]+" : "+count);
        }else{
            System.out.println(arr[arr.length-1]+" : "+count);
        }
    }
}
