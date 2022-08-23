package Arrays;

public class TappingRainWater {
    public static void main(String args[]){
        int arr[]=new int[]{2,0,2};
        System.out.println(GetRainWater(arr));
    }
    public static int GetRainWater(int arr[]){
        int res=0;
        int lmax[]=new int[arr.length];
        int rmax[]=new int[arr.length];
        lmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lmax[i]= Math.max(arr[i], lmax[i-1]);
        }
        rmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rmax[i]=Math.max(arr[i], rmax[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            res+=(Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;
    }
}
